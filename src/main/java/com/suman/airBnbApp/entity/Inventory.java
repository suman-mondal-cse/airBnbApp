package com.suman.airBnbApp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(
        uniqueConstraints = @UniqueConstraint(
            name = "unique_hotel_room_date",
            columnNames = {"hotel_id", "room_id", "date"}
        ))
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false, columnDefinition = "Integer Default 0")
    private Integer bookedCount;

    @Column(nullable = false)
    private Integer totalCount;

    @CurrentTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CurrentTimestamp
    @Column(updatable = true)
    private LocalDateTime updatedAt;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal surgeFactory;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal price; //basePrice * surgeFactory

    @Column(nullable = false)
    private String city;

    @JsonFormat
    @Column(nullable = false)
    private Boolean closed;

}
