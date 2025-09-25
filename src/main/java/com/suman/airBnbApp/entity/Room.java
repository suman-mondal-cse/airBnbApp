package com.suman.airBnbApp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false) // inside DB it should be hotel_id and in java code it is hotel
    private Hotel hotel;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal basePrice;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CurrentTimestamp
    private LocalDateTime updatedAt;

    @Column(columnDefinition = "TEXT[]")
    private String[] amenities;

    @Column(columnDefinition = "Text[]")
    private String[] photos;

    @Column(nullable = false)
    private Integer totalCount;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Boolean active;
}
