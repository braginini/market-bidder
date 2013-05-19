package ru.mbragin.marketbidder.business.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mbragin.marketbidder.business.entity.ProjectsEntity;
import ru.mbragin.marketbidder.business.services.ProjectService;
import ru.mbragin.marketbidder.dataaccess.ProjectDao;
import ru.mbragin.marketbidder.model.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mikhail Bragin
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectDao projectDao;

    @Override
    public ProjectsEntity getAccountProjects(long accountId, Integer page, Long limit) throws Exception {
        List<Project> projects;
        Integer totalPages = null;
        Integer projectsCount = null;

        if (page == null || limit == null)
            projects = projectDao.getAllAccountProjects(accountId);
        else {
            projectsCount = this.getAccountProjectsCount(accountId);
            if (projectsCount > 0) {
                double d = projectsCount / (double) limit;
                totalPages = (int) Math.ceil(d);
            } else {
                totalPages = 0;
            }
            if (page > totalPages)
                page = totalPages;

            long start = limit * page - limit;

            projects = projectDao.getAccountProjects(accountId, start, limit);
        }

        return new ProjectsEntity(totalPages, projectsCount, projects);
    }

    @Override
    public int getAccountProjectsCount(long accountId) throws Exception {
        return projectDao.getAccountProjectsCount(accountId);
    }

    @Override
    public long saveProject(Project project) throws Exception {
        long projectId;
        if (project.getId() != null) {
            projectDao.updateProject(project);
            projectId = project.getId();
        } else
            projectId = projectDao.createProject(project);

        return projectId;
    }

    @Override
    public Project getProjectById(Long projectId) throws Exception {
        Project project = projectDao.getProjectById(projectId);
        return project;
    }

    @Override
    public void updateProjectToken(Long projectId, String token) throws Exception {
        Project project = getProjectById(projectId);
        if (project == null)
            throw new RuntimeException("No project found");
        project.setYandexToken(token);
        projectDao.updateProject(project);
    }

    @Override
    public void deleteProject(Long projectId) throws Exception {
        Project project = getProjectById(projectId);
        if (project == null)
            return;
        projectDao.deleteProject(projectId);
    }
}
