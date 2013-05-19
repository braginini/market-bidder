package ru.mbragin.marketbidder.model;

/**
 * @author: mbragin
 */
public class Campaign {

    private long id;

    private String domain;

    private byte state;

    private byte[] reasons;

    private long projectId;

    public Campaign() {
    }

    public Campaign(long campaignId, String domain, byte[] reasons, byte state) {
        this.id = campaignId;
        this.domain = domain;
        this.reasons = reasons;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public byte[] getReasons() {
        return reasons;
    }

    public void setReasons(byte[] reasons) {
        this.reasons = reasons;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campaign campaign = (Campaign) o;

        if (id != campaign.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", domain='" + domain + '\'' +
                ", state=" + state +
                ", reasons=" + reasons +
                ", projectId=" + projectId +
                '}';
    }
}
