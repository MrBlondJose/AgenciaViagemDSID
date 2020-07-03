
package com.dsid.viagem.demo.DadosHotels.Models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "content_id",
    "provider_display_name",
    "internal_provider_name",
    "logo",
    "treatment",
    "is_bookable",
    "availability",
    "display_style",
    "free_cancellation_message",
    "free_cancellation_detail",
    "pay_at_stay_message",
    "display_price",
    "display_price_int",
    "link",
    "auction_offer_key",
    "strikethrough_price",
    "charge_source",
    "partner_can_send_email_marketing",
    "partner_sends_confirmation_email",
    "tripadvisor_sends_confirmation_email",
    "commerce_args"
})
@Setter
@Getter
public class Offer implements Serializable
{

    @JsonProperty("content_id")
    private String contentId;
    @JsonProperty("provider_display_name")
    private String providerDisplayName;
    @JsonProperty("internal_provider_name")
    private String internalProviderName;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("treatment")
    private String treatment;
    @JsonProperty("is_bookable")
    private Boolean isBookable;
    @JsonProperty("availability")
    private String availability;
    @JsonProperty("display_style")
    private String displayStyle;
    @JsonProperty("free_cancellation_message")
    private String freeCancellationMessage;
    @JsonProperty("free_cancellation_detail")
    private String freeCancellationDetail;
    @JsonProperty("pay_at_stay_message")
    private String payAtStayMessage;
    @JsonProperty("display_price")
    private String displayPrice;
    @JsonProperty("display_price_int")
    private String displayPriceInt;
    @JsonProperty("link")
    private String link;
    @JsonProperty("auction_offer_key")
    private String auctionOfferKey;
    @JsonProperty("strikethrough_price")
    private String strikethroughPrice;
    @JsonProperty("charge_source")
    private String chargeSource;
    @JsonProperty("partner_can_send_email_marketing")
    private Boolean partnerCanSendEmailMarketing;
    @JsonProperty("partner_sends_confirmation_email")
    private Boolean partnerSendsConfirmationEmail;
    @JsonProperty("tripadvisor_sends_confirmation_email")
    private Boolean tripadvisorSendsConfirmationEmail;
    @JsonProperty("commerce_args")
    private String commerceArgs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8337706324835585245L;

    @JsonProperty("content_id")
    public String getContentId() {
        return contentId;
    }

    @JsonProperty("content_id")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @JsonProperty("provider_display_name")
    public String getProviderDisplayName() {
        return providerDisplayName;
    }

    @JsonProperty("provider_display_name")
    public void setProviderDisplayName(String providerDisplayName) {
        this.providerDisplayName = providerDisplayName;
    }

    @JsonProperty("internal_provider_name")
    public String getInternalProviderName() {
        return internalProviderName;
    }

    @JsonProperty("internal_provider_name")
    public void setInternalProviderName(String internalProviderName) {
        this.internalProviderName = internalProviderName;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("treatment")
    public String getTreatment() {
        return treatment;
    }

    @JsonProperty("treatment")
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @JsonProperty("is_bookable")
    public Boolean getIsBookable() {
        return isBookable;
    }

    @JsonProperty("is_bookable")
    public void setIsBookable(Boolean isBookable) {
        this.isBookable = isBookable;
    }

    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @JsonProperty("display_style")
    public String getDisplayStyle() {
        return displayStyle;
    }

    @JsonProperty("display_style")
    public void setDisplayStyle(String displayStyle) {
        this.displayStyle = displayStyle;
    }

    @JsonProperty("free_cancellation_message")
    public String getFreeCancellationMessage() {
        return freeCancellationMessage;
    }

    @JsonProperty("free_cancellation_message")
    public void setFreeCancellationMessage(String freeCancellationMessage) {
        this.freeCancellationMessage = freeCancellationMessage;
    }

    @JsonProperty("free_cancellation_detail")
    public String getFreeCancellationDetail() {
        return freeCancellationDetail;
    }

    @JsonProperty("free_cancellation_detail")
    public void setFreeCancellationDetail(String freeCancellationDetail) {
        this.freeCancellationDetail = freeCancellationDetail;
    }

    @JsonProperty("pay_at_stay_message")
    public String getPayAtStayMessage() {
        return payAtStayMessage;
    }

    @JsonProperty("pay_at_stay_message")
    public void setPayAtStayMessage(String payAtStayMessage) {
        this.payAtStayMessage = payAtStayMessage;
    }

    @JsonProperty("display_price")
    public String getDisplayPrice() {
        return displayPrice;
    }

    @JsonProperty("display_price")
    public void setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
    }

    @JsonProperty("display_price_int")
    public String getDisplayPriceInt() {
        return displayPriceInt;
    }

    @JsonProperty("display_price_int")
    public void setDisplayPriceInt(String displayPriceInt) {
        this.displayPriceInt = displayPriceInt;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("auction_offer_key")
    public String getAuctionOfferKey() {
        return auctionOfferKey;
    }

    @JsonProperty("auction_offer_key")
    public void setAuctionOfferKey(String auctionOfferKey) {
        this.auctionOfferKey = auctionOfferKey;
    }

    @JsonProperty("strikethrough_price")
    public String getStrikethroughPrice() {
        return strikethroughPrice;
    }

    @JsonProperty("strikethrough_price")
    public void setStrikethroughPrice(String strikethroughPrice) {
        this.strikethroughPrice = strikethroughPrice;
    }

    @JsonProperty("charge_source")
    public String getChargeSource() {
        return chargeSource;
    }

    @JsonProperty("charge_source")
    public void setChargeSource(String chargeSource) {
        this.chargeSource = chargeSource;
    }

    @JsonProperty("partner_can_send_email_marketing")
    public Boolean getPartnerCanSendEmailMarketing() {
        return partnerCanSendEmailMarketing;
    }

    @JsonProperty("partner_can_send_email_marketing")
    public void setPartnerCanSendEmailMarketing(Boolean partnerCanSendEmailMarketing) {
        this.partnerCanSendEmailMarketing = partnerCanSendEmailMarketing;
    }

    @JsonProperty("partner_sends_confirmation_email")
    public Boolean getPartnerSendsConfirmationEmail() {
        return partnerSendsConfirmationEmail;
    }

    @JsonProperty("partner_sends_confirmation_email")
    public void setPartnerSendsConfirmationEmail(Boolean partnerSendsConfirmationEmail) {
        this.partnerSendsConfirmationEmail = partnerSendsConfirmationEmail;
    }

    @JsonProperty("tripadvisor_sends_confirmation_email")
    public Boolean getTripadvisorSendsConfirmationEmail() {
        return tripadvisorSendsConfirmationEmail;
    }

    @JsonProperty("tripadvisor_sends_confirmation_email")
    public void setTripadvisorSendsConfirmationEmail(Boolean tripadvisorSendsConfirmationEmail) {
        this.tripadvisorSendsConfirmationEmail = tripadvisorSendsConfirmationEmail;
    }

    @JsonProperty("commerce_args")
    public String getCommerceArgs() {
        return commerceArgs;
    }

    @JsonProperty("commerce_args")
    public void setCommerceArgs(String commerceArgs) {
        this.commerceArgs = commerceArgs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
