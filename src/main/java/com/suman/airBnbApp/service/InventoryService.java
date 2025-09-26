package com.suman.airBnbApp.service;

import com.suman.airBnbApp.dto.HotelDto;
import com.suman.airBnbApp.dto.HotelSearchRequestDto;
import com.suman.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequestDto hotelSearchRequestDto);
}
