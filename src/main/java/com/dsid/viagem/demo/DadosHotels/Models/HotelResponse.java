package com.dsid.viagem.demo.DadosHotels.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class HotelResponse implements Serializable {
    List<Hotel> data;
}
