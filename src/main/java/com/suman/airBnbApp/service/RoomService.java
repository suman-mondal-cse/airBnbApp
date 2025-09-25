package com.suman.airBnbApp.service;

import com.suman.airBnbApp.dto.RoomDto;

import java.lang.classfile.Interfaces;
import java.util.List;

public interface RoomService {

    RoomDto CreateNewRoom(RoomDto roomDto);

    List<RoomDto> getAllRooms();
}
