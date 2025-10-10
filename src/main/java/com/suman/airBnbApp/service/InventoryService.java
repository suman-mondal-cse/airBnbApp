package com.suman.airBnbApp.service;

import com.suman.airBnbApp.dto.HotelPriceDto;
import com.suman.airBnbApp.dto.HotelSearchRequest;
import com.suman.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
