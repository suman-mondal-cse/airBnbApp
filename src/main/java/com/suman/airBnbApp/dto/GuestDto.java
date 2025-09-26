package com.suman.airBnbApp.dto;

import com.suman.airBnbApp.entity.User;
import com.suman.airBnbApp.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
