package com.example.springboot_mall.service;

import com.example.springboot_mall.dto.UserRegisterRequest;
import com.example.springboot_mall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
