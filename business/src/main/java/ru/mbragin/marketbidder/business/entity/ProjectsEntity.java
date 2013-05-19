package ru.mbragin.marketbidder.business.entity;

import ru.mbragin.marketbidder.model.Project;

import java.util.List;

/**
 * @author: Mikhail Bragin
 */
public class ProjectsEntity {

    private Integer totalPages;

    private Integer projectsCount;

    private List<Project> projects;

    public ProjectsEntity() {
    }

    public ProjectsEntity(Integer totalPages, Integer projectsCount, List<Project> projects) {
        this.totalPages = totalPages;
        this.projectsCount = projectsCount;
        this.projects = projects;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Integer getProjectsCount() {
        return projectsCount;
    }

    public void setProjectsCount(Integer projectsCount) {
        this.projectsCount = projectsCount;
    }

    @Override
    public String toString() {
        return "ProjectsEntity{" +
                "totalPages=" + totalPages +
                ", projects=" + projects +
                '}';
    }
}
