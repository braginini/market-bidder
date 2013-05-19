package ru.mbragin.marketbidder.model;

/**
 * @author: Mikhail Bragin
 */
public class Project {

    private Long id;

    private String title;

    private String description;

    private String url;

    private String yandexLogin;

    private String yandexToken;

    private Long accountId;

    private boolean defaultProject;

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYandexLogin() {
        return yandexLogin;
    }

    public void setYandexLogin(String yandexLogin) {
        this.yandexLogin = yandexLogin;
    }

    public String getYandexToken() {
        return yandexToken;
    }

    public void setYandexToken(String yandexToken) {
        this.yandexToken = yandexToken;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public boolean isDefaultProject() {
        return defaultProject;
    }

    public void setDefaultProject(boolean defaultProject) {
        this.defaultProject = defaultProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (id != project.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", yandexLogin='" + yandexLogin + '\'' +
                ", yandexToken='" + yandexToken + '\'' +
                ", accountId=" + accountId +
                ", defaultProject=" + defaultProject +
                '}';
    }
}
