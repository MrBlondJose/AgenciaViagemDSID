package com.dsid.viagem.demo.Controller;

import com.dsid.viagem.demo.DadosHotels.Models.Image;
import com.dsid.viagem.demo.DadosLocalizacoes.DadosLocalizacoesAeroportosSerivce;
import com.dsid.viagem.demo.DadosLocalizacoes.DadosLocalizacoesService;
import com.dsid.viagem.demo.DadosVoos.DadosVoosService;
import com.dsid.viagem.demo.DadosVoos.model.Voo;
import com.dsid.viagem.demo.PackageBuilder.models.Airport;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class DadosVoosController {

    @Autowired
    private DadosVoosService dadosVoosService;

    @Autowired
    DadosLocalizacoesAeroportosSerivce dadosLocalizacoesAeroportosSerivce;

    @Autowired
    DadosLocalizacoesService dadosLocalizacoesService;


    @Autowired
    private ObjectMapper mapper;

    @GetMapping(path="/voos", produces = "application/json")
    public String getDadosVoos(
            @RequestParam(required = true) String destino,
            @RequestParam(required = true) String origem,
            @RequestParam(required = true) String dd1,
            @RequestParam(required = false) String dd2,
            @RequestParam(required = false) String o2,
            @RequestParam(required = false) String d2,
            @RequestParam(required = false) String ta,
            @RequestParam(required = false) String ts,
            @RequestParam(required = false) String tc,
            @RequestParam(required = false) String c) throws JsonProcessingException {
        Map<String,String> parameters= new HashMap<String, String>();


        parameters.put("d1",this.getNearAirportFromLocation(destino,"200"));
        parameters.put("o1",this.getNearAirportFromLocation(origem,"200"));
        parameters.put("dd1",dd1);
        if(dd2!=null)parameters.put("dd2",dd2);
        if(o2!=null)parameters.put("o2",o2);
        if(d2!=null)parameters.put("d2",d2);
        if(ta!=null)parameters.put("ta",ta);
        if(ts!=null)parameters.put("ts",ts);
        if(tc!=null)parameters.put("tc",tc);
        if(c!=null)parameters.put("c",c);
        List<Voo> response= this.dadosVoosService.getExternalFlighData(parameters);
        return mapper.writeValueAsString(response);
    }


    public  String getNearAirportFromLocation(String locationQuery, String radius){
        Map<String,Object> dadosLocation=this.getLocationData(locationQuery);
        String latitude= this.getLatitude(dadosLocation);
        String longitude=this.getLongitude(dadosLocation);
        List<Airport> airports=new ArrayList<>();
        String locationArrumada=locationQuery.trim().toLowerCase().replaceAll("_","").replaceAll("ã","a").replaceAll(" ","");
        if(locationArrumada.equals("saopaulo") || locationArrumada.equals("guarulhos")){
            airports.add( Airport.createGuarulhos());
            return airports.get(0).getIataCode();
        }
        Map<String,Object> aeroportosProximos= this.dadosLocalizacoesAeroportosSerivce.getNearAirportsData(latitude,longitude,radius,"2");
        int size= ((List<Map>)(aeroportosProximos.get("items"))).size();

        for(int i=0;i<size && i<5;i++){
            airports.add(new Airport(aeroportosProximos,i,this.getLocationId(dadosLocation)));
        }
        return airports.get(0).getIataCode();
    }


    private String getLocationId(Map<String,Object> locationsResponse){
        List<Map> data= (List<Map>) locationsResponse.get("data");
        Map<String,Object> resultObject=(Map<String, Object>) (data.get(0).get("result_object"));
        return (String)resultObject.get("location_id");
    }

    private Map<String,Object> getLocationData(String locationQuery){
        Map<String,String> parameters= new HashMap<>();
        parameters.put("units","km");
        parameters.put("query",locationQuery);
        Map<String,Object> map= dadosLocalizacoesService.getLocationsData(parameters);
        return map;
    }

    private String getLatitude(Map<String,Object> locationsResponse){
        List<Map> data= (List<Map>) locationsResponse.get("data");
        Map<String,Object> resultObject=(Map<String, Object>) (data.get(0).get("result_object"));
        return (String)resultObject.get("latitude");

    }

    private String getLongitude(Map<String,Object> locationsResponse){
        List<Map> data= (List<Map>) locationsResponse.get("data");
        Map<String,Object> resultObject=(Map<String, Object>) (data.get(0).get("result_object"));
        return (String)resultObject.get("longitude");
    }


}
