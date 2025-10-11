package com.suman.airBnbApp.service;

import com.suman.airBnbApp.dto.ProfileUpdateRequestDto;
import com.suman.airBnbApp.dto.UserDto;
import com.suman.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
