package ru.mbragin.marketbidder.controller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import ru.mbragin.marketbidder.business.entity.ProjectsEntity;
import ru.mbragin.marketbidder.business.security.CustomUserAuthentication;
import ru.mbragin.marketbidder.business.services.ProjectService;
import ru.mbragin.marketbidder.controller.response.AddProjectResponse;
import ru.mbragin.marketbidder.controller.response.LoadProjectResponse2;
import ru.mbragin.marketbidder.controller.response.LoadProjectsResponse;
import ru.mbragin.marketbidder.controller.response.TokenResponse;
import ru.mbragin.marketbidder.model.Project;
import ru.mbragin.marketbidder.model.User;

import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.List;

/**
 * @author: Mikhail Bragin
 */
@Controller("clientController")
public class ClientController extends AbstractController {

    private static final String CLIENT_ID = "491d2964efa7491e9ccabc2891ba4512";
    private static final String YANDEX_GET_CODE_URL =
            "https://oauth.yandex.ru/authorize?response_type=code&client_id=" + CLIENT_ID;
    private static final String CLIENT_PASSWORD = "7846fcf688464e82ba7f91585c8731be";

    @Override
    public void init() {

    }

    @Override
    public void destroy() {
    }

    @Autowired
    ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET, value = "/dashboard")
    public String showDashBoard(ModelMap model, Principal principal) throws Exception {
        List<Project> projects = getProjects(getUser(principal).getAccountId(), null, null).getProjects();

        //return parameters to client
        if (projects.size() == 0) {
            model.addAttribute("no_projects", true);
            return "redirect:/projects";
        }

        for (Project project : projects) {
            if (project.isDefaultProject()) {
                model.addAttribute("default_project", project);
                return "redirect:/project";
            }
        }

        return "redirect:/projects";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addproject")
    public ResponseEntity<AddProjectResponse> addProject(Project project, Principal principal, HttpServletResponse httpResponse) throws Exception {
        CustomUserAuthentication authentication = (CustomUserAuthentication) principal;
        project.setAccountId(authentication.getUser().getAccountId());
        long projectId = projectService.saveProject(project);

        //TODO make redirect on server, not on client side!!!
        AddProjectResponse response = new AddProjectResponse(YANDEX_GET_CODE_URL, projectId);
        return new ResponseEntity<AddProjectResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects")
    public String projects(ModelMap model, Principal principal) throws Exception {
        return "projects";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/loadprojects")
    public ResponseEntity<LoadProjectsResponse> loadProjects(Principal principal) throws Exception {

        ProjectsEntity projectsEntity = getProjects(getUser(principal).getAccountId(), null, null);
        List<Project> projects = projectsEntity.getProjects();
        LoadProjectsResponse response = new LoadProjectsResponse(projects);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/project")
    public String getProject(@RequestParam("projectId") Long projectId,  Principal principal) throws Exception {

        return "project";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/addtoken")
    public String addToken(@RequestParam("code") String code, @RequestParam("state") Long projectId) throws Exception {
        if (projectId == null)
            throw new RuntimeException("No project id specified");

        RestTemplate template = new RestTemplate();
        String url = "https://oauth.yandex.ru/token";

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "authorization_code");
        params.add("code", code);
        params.add("client_id", CLIENT_ID);
        params.add("client_secret", CLIENT_PASSWORD);

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, requestHeaders);

        ResponseEntity<TokenResponse> response = template.exchange(url, HttpMethod.POST, requestEntity, TokenResponse.class);


        if (response.getStatusCode().equals(HttpStatus.OK))
            projectService.updateProjectToken(projectId, response.getBody().getToken());
        else
            projectService.deleteProject(projectId);

        return "redirect:/projects";
    }

    private ProjectsEntity getProjects(long accountId, Integer page, Long limit) throws Exception {
        return projectService.getAccountProjects(accountId, page, limit);
    }

    private User getUser(Principal principal) {
        CustomUserAuthentication authentication = (CustomUserAuthentication) principal;
        return authentication.getUser();
    }


}
