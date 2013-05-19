package ru.mbragin.marketbidder.controller.response;

import org.codehaus.jackson.annotate.JsonProperty;
import ru.mbragin.marketbidder.controller.element.CampaignElement;

import java.util.List;

/**
 * @author: Mikhail Bragin
 */
public class AddProjectResponse implements IResponse {

    @JsonProperty("redirect_url")
    private String redirectUrl;

    public AddProjectResponse() {
    }

    public AddProjectResponse(String redirectUrl, Long projectId) {
        this.redirectUrl = redirectUrl + "&state=" + projectId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
