package com.example.demo.Controller;

import com.example.demo.Moduls.User.AppUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private String accessToken;
    private String refreshToken;
    private AppUser appUser;
}
