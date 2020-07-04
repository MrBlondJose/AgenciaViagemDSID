package com.dsid.viagem.demo.Controller;

import com.dsid.viagem.demo.PackageBuilder.service.PackageBuilderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PackageBuilderController {

    @Autowired
   private PackageBuilderService packageBuilderService;

    @GetMapping(path="/pacotes", produces = "application/json")
    public String getPackages(
            @RequestParam(required = true) String origin,
            @RequestParam(required = true) String destiny,
            @RequestParam(required = true) String checkin,
            @RequestParam(required = true) String adults,
            @RequestParam(required = true) String rooms,
            @RequestParam(required = true) String nights,
            @RequestParam(required = false) String hotel_class,
            @RequestParam(required = false) String pricesmax
    ) throws Exception {

        Map<String,String> parametSers=new HashMap<>();
        parametSers.put("checkin",checkin);
        parametSers.put("adults",adults);
        parametSers.put("nights",nights);
        parametSers.put("sort","recommended");
        parametSers.put("rooms",rooms);
        parametSers.put("offset","0");
        parametSers.put("order","asc");
        parametSers.put("limit","30");
        parametSers.put("hotel_class",hotel_class);
        parametSers.put("pricesmax",pricesmax);
        ObjectMapper mapper=new ObjectMapper();
        String json="{}";
        for(int i=0;i<3;i++) {
            try {
              json  = mapper.writeValueAsString(packageBuilderService.getPackages(origin, destiny, "20", parametSers));
              break;
            } catch (Exception e) {
                continue;
            }
        }
        return json;
    }
}
