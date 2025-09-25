package com.suman.airBnbApp.service;


import com.suman.airBnbApp.dto.HotelDto;
public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activeHotel(Long hotelId);
}
