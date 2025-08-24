package com.suman.airBnbApp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class HotelContactInfo {
    private String completeAddress;
    private String location;
    private String email;
    private String phoneNumber;
}
