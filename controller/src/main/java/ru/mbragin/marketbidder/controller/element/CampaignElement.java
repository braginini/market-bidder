package ru.mbragin.marketbidder.controller.element;

import org.codehaus.jackson.annotate.JsonProperty;
import ru.mbragin.marketbidder.model.Campaign;

/**
 * @author: mbragin
 */
public class CampaignElement {

    @JsonProperty("id")
    private long campaignId;

    @JsonProperty("domain")
    private String domain;

    @JsonProperty("state")
    private byte state;

    @JsonProperty("reasons")
    private byte[] reasons;

    public CampaignElement(Campaign campaign) {
        if (campaign == null) return;
        this.campaignId = campaign.getId();
        this.domain = campaign.getDomain();
        this.state = campaign.getState();
        this.reasons = campaign.getReasons();
    }


}
