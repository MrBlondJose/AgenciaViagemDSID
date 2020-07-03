package com.dsid.viagem.demo.DadosHotels;

import com.dsid.viagem.demo.DadosHotels.Models.Hotel;
import com.dsid.viagem.demo.DadosHotels.Models.HotelResponse;
import com.dsid.viagem.demo.restAPICall.TripAdvisorCallService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DadosHotelService {

    @Autowired
    private TripAdvisorCallService tripAdvisorCallService;

    private final String endpointUrl = "https://tripadvisor1.p.rapidapi.com/hotels/list";



    public List<Hotel> getExternalHotelData(Map<String, String> parameters) {
       try{
           Map<String,Object> response= (Map<String,Object>)tripAdvisorCallService.getMethod(new HashMap<String, String>(),endpointUrl,parameters, Map.class);
           this.filtrarResponse(response);
           return this.convertToHotelList(response);
       }
       catch (Exception e){
           return new ArrayList<>();
       }
    }

    /**
     * Retorna infos de quartos de hoteis persistidos no Banco de dados
     * @return
     */
    public Object getHotelinDB(String hotelId){
        return null;
    }

    private List<Hotel> convertToHotelList(Map<String,Object> response) throws JsonProcessingException {
        Map<String,Object> filteredResponse= new HashMap<String, Object>();
        List<Map> data= (List<Map>)response.get("data");
        List<Hotel> dataResult=new ArrayList<>();
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        for(Map o:data){
            String json= mapper.writeValueAsString(o);
            Hotel hotel= mapper.readValue(json,Hotel.class);
            dataResult.add(hotel);
        }
        return dataResult;
    }

    private Map<String,Object> filtrarResponse(Map<String,Object> response){
        Map<String,Object> filteredResponse= new HashMap<String, Object>();
        List<Map> data= (List<Map>)response.get("data");
        List<Map> dataResult=new ArrayList<>();
        for(Map o:data){
                List<Map> offers=(List<Map>)(((Map<String, Object>) o.get("hac_offers"))).get("offers");
                List<Map> offersResult= new ArrayList<>();
                for(Map offersEntry: offers){
                    if((offersEntry.get("availability").equals("available"))){
                        offersResult.add(offersEntry);
                    }
                }
            ((Map<String, Object>) o.get("hac_offers")).put("offers",offersResult);
            if(offersResult.size()>0) dataResult.add(o);

        }

        response.put("data",dataResult);
        return null;
    }
}
