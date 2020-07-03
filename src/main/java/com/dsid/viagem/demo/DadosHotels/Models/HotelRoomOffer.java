package com.dsid.viagem.demo.DadosHotels.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class HotelRoomOffer {

        private String nomeHotel;


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
}
