package com.dsid.viagem.demo.PackageBuilder.models;

import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter

public class Airport {
    private String icaoCode;
    private String iataCode;
    private String name;
    private String cityName;
    private double latitude;
    private double longitude;
    private String countryCode;
    private String locationId;

    public Airport(Map<String,Object> map, int index, String locationId){
        List<Map> items= (List<Map>) map.get("items");
        Map<String,Object> itemsMap=items.get(index);
        this.iataCode=(String) itemsMap.get("iata");
        this.icaoCode=(String)itemsMap.get("icao");
        this.name=(String)itemsMap.get("name");
        this.cityName=(String)itemsMap.get("municipalityName");
        Map<String,Double> locationMap=(Map<String, Double>) itemsMap.get("location");
        this.latitude=locationMap.get("lat");
        this.longitude=locationMap.get("lon");
        this.countryCode=(String)itemsMap.get("countryCode");
        this.locationId=locationId;
    }
}
