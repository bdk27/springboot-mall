package com.example.springboot_mall.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserLoginRequest {

    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
}
