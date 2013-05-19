package ru.mbragin.marketbidder.dataaccess;

import ru.mbragin.marketbidder.model.Campaign;
import ru.mbragin.marketbidder.model.Project;

import java.io.IOError;
import java.io.IOException;
import java.util.List;

/**
 * @author: Mikhail Bragin
 */
public interface ProjectDao {

    List<Project> getAllAccountProjects(long accountId) throws IOException;

    int getAccountProjectsCount(long accountId) throws IOException;

    long createProject(Project project) throws IOException;

    void updateProject(Project project) throws IOException;

    Project getProjectById(Long projectId) throws IOException;

    void deleteProject(long id) throws IOException;

    List<Project> getAccountProjects(long accountId, long start, Long limit) throws IOException;
}
