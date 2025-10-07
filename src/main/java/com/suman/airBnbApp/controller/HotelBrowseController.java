package com.suman.airBnbApp.controller;

import com.suman.airBnbApp.dto.HotelDto;
import com.suman.airBnbApp.dto.HotelInfoDto;
import com.suman.airBnbApp.dto.HotelPriceDto;
import com.suman.airBnbApp.dto.HotelSearchRequestDto;
import com.suman.airBnbApp.service.HotelService;
import com.suman.airBnbApp.service.InventoryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
@Slf4j
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequestDto hotelSearchRequestDto){
       Page<HotelPriceDto> page =  inventoryService.searchHotels(hotelSearchRequestDto);
       return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }


}
