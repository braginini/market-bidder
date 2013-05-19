package ru.mbragin.marketbidder.controller.element;

import org.codehaus.jackson.annotate.JsonProperty;
import ru.mbragin.marketbidder.model.Project;

/**
 * @author: Mikhail Bragin
 */
public class ProjectElement {

    @JsonProperty("")
    private Long id;

    @JsonProperty("")
    private String title;

    @JsonProperty("")
    private String url;

    @JsonProperty("")
    private boolean defaultProject;

    public ProjectElement() {
    }

    public ProjectElement(Project p) {
        if (p != null) {
            this.id = p.getId();
            this.title = p.getTitle();
            this.url = p.getUrl();
            this.defaultProject = p.isDefaultProject();
        }
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public boolean isDefaultProject() {
        return defaultProject;
    }
}
