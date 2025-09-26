package com.suman.airBnbApp.service;


import com.suman.airBnbApp.dto.HotelDto;
import com.suman.airBnbApp.dto.HotelInfoDto;

import java.util.List;

public interface HotelService {

    List<HotelDto> getAllHotel();

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activeHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
