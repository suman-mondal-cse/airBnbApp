package com.suman.airBnbApp.dto;

import com.suman.airBnbApp.entity.Hotel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RoomDto {

    private Long id;
    private String type;
    private BigDecimal basePrice;
    private String[] amenities;
    private String[] photos;
    private Integer totalCount;
    private Integer capacity;
}
