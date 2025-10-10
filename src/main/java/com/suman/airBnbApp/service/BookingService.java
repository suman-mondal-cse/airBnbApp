package com.suman.airBnbApp.service;

import com.suman.airBnbApp.dto.BookingDto;
import com.suman.airBnbApp.dto.BookingRequest;
import com.suman.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
