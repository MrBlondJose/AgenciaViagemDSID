
package com.dsid.viagem.demo.DadosHotels.Models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;


@JsonInclude(JsonInclude.Include.NON_NULL)
/*@JsonPropertyOrder({
    "location_id",
    "name",
    "latitude",
    "longitude",
    "num_reviews",
    "timezone",
    "location_string",
    "photo",
    "awards",
    "preferred_map_engine",
    "raw_ranking",
    "ranking_geo",
    "ranking_geo_id",
    "ranking_position",
    "ranking_denominator",
    "ranking_category",
    "ranking",
    "subcategory_type",
    "subcategory_type_label",
    "distance",
    "distance_string",
    "bearing",
    "rating",
    "is_closed",
    "is_long_closed",
    "price_level",
    "price",
    "neighborhood_info",
    "hac_offers",
    "hotel_class",
    "hotel_class_attribution",
    "business_listings",
    "special_offers",
    "listing_key",
    "description",
    "web_url",
    "write_review",
    "ancestors",
    "category",
    "subcategory",
    "parent_display_name",
    "guide_count",
    "is_jfy_enabled",
    "nearest_metro_station",
    "phone",
    "website",
    "email",
    "address_obj",
    "address",
    "local_name",
    "local_address",
    "local_lang_code",
    "is_candidate_for_contact_info_suppression",
    "amenities",
    "photo_count",
    "has_review_draft",
    "has_panoramic_photos",
    "rating_histogram",
    "room_tips"
})*/
@Getter
@Setter
public class Hotel implements Serializable
{

    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("num_reviews")
    private String numReviews;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("location_string")
    private String locationString;
    @JsonProperty("preferred_map_engine")
    private String preferredMapEngine;
    @JsonProperty("raw_ranking")
    private String rawRanking;
    @JsonProperty("ranking_geo")
    private String rankingGeo;
    @JsonProperty("ranking_geo_id")
    private String rankingGeoId;
    @JsonProperty("ranking_position")
    private String rankingPosition;
    @JsonProperty("ranking_denominator")
    private String rankingDenominator;
    @JsonProperty("ranking_category")
    private String rankingCategory;
    @JsonProperty("ranking")
    private String ranking;
    @JsonProperty("subcategory_type")
    private String subcategoryType;
    @JsonProperty("subcategory_type_label")
    private String subcategoryTypeLabel;
    @JsonProperty("distance")
    private String distance;
    @JsonProperty("distance_string")
    private Object distanceString;
    @JsonProperty("bearing")
    private String bearing;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("is_closed")
    private Boolean isClosed;
    @JsonProperty("is_long_closed")
    private Boolean isLongClosed;
    @JsonProperty("price_level")
    private String priceLevel;
    @JsonProperty("price")
    private String price;
    @JsonProperty("hac_offers")
    private HacOffers hacOffers;
    @JsonProperty("hotel_class")
    private String hotelClass;
    @JsonProperty("hotel_class_attribution")
    private String hotelClassAttribution;
    @JsonProperty("description")
    private String description;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("write_review")
    private String writeReview;
    @JsonProperty("parent_display_name")
    private String parentDisplayName;
    @JsonProperty("guide_count")
    private String guideCount;
    @JsonProperty("is_jfy_enabled")
    private Boolean isJfyEnabled;

    @JsonIgnore
    private List<Object> nearestMetroStation = null;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("website")
    private String website;
    @JsonProperty("email")
    private String email;
    @JsonProperty("address_obj")
    private AddressObj addressObj;
    @JsonProperty("address")
    private String address;
    @JsonProperty("local_name")
    private String localName;
    @JsonProperty("local_address")
    private String localAddress;
    @JsonProperty("local_lang_code")
    private String localLangCode;
    @JsonProperty("is_candidate_for_contact_info_suppression")
    private Boolean isCandidateForContactInfoSuppression;
    @JsonProperty("photo_count")
    private String photoCount;
    @JsonProperty("has_review_draft")
    private Boolean hasReviewDraft;
    @JsonProperty("has_panoramic_photos")
    private Boolean hasPanoramicPhotos;

    @JsonIgnore
    public Hotel getSimpleHotel() throws JsonProcessingException {
        Hotel hotel= new Hotel();
        hotel.setLocationId(this.locationId);
        hotel.setName(this.name);
        hotel.setLatitude(this.latitude);
        hotel.setLongitude(this.longitude);
        hotel.setAddress(this.address);
        hotel.setTimezone(this.timezone);
        hotel.setPhone(this.phone);
        hotel.setWebUrl(this.webUrl);
        hotel.setHacOffers(null);
        return hotel;

    }






}
