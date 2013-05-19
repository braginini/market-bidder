package ru.mbragin.marketbidder.business.services;

import ru.mbragin.marketbidder.business.entity.ProjectsEntity;
import ru.mbragin.marketbidder.model.Campaign;
import ru.mbragin.marketbidder.model.Project;

import java.util.List;

/**
 * @author: Mikhail Bragin
 */
public interface ProjectService {

    ProjectsEntity getAccountProjects(long accountId, Integer page, Long limit) throws Exception;

    int getAccountProjectsCount(long accountId) throws Exception;

    long saveProject(Project project) throws  Exception;

    Project getProjectById(Long state) throws Exception;

    void updateProjectToken(Long projectId, String token) throws Exception;

    void deleteProject(Long projectId) throws Exception;
}
