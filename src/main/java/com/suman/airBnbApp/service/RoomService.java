package com.suman.airBnbApp.service;

import com.suman.airBnbApp.dto.RoomDto;

import java.lang.classfile.Interfaces;
import java.util.List;

public interface RoomService {

    RoomDto CreateNewRoom(Long hotelId, RoomDto roomDto);

    List<RoomDto> getAllRoomsInHotel(Long hotelId);

    RoomDto getRoomById(Long roomId);

    void deleteRoomById(Long roomId);
}
