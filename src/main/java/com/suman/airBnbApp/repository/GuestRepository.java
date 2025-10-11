package com.suman.airBnbApp.repository;

import com.suman.airBnbApp.entity.Guest;
import com.suman.airBnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}