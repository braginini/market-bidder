package ru.mbragin.marketbidder.controller.response;

import org.codehaus.jackson.annotate.JsonProperty;
import ru.mbragin.marketbidder.controller.element.ProjectElement;
import ru.mbragin.marketbidder.model.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mikhail Bragin
 */
public class LoadProjectsResponse {

    @JsonProperty("")
    private List<ProjectElement> projects;

    public LoadProjectsResponse() {
    }

    public LoadProjectsResponse(List<Project> projects) {
        this.projects =  new ArrayList<>(projects.size());
        for (Project p : projects) {
            this.projects.add(new ProjectElement(p));
        }
    }

    public List<ProjectElement> getProjects() {
        return projects;
    }
}
