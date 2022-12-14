package com.example.demo.Controller;

import com.example.demo.Moduls.Request.RegistrationRequest;
import com.example.demo.Service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;


    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
    @PostMapping("/confirm/{token}")
    public String confirm(@PathVariable("token") String token){
        return registrationService.confirmToken(token);
    }
//    @GetMapping("/refresh/token")
//    public String refresh(HttpServletRequest request , HttpServletResponse response) throws IOException {
//        return registrationService.refreshToken(request , response);
//    }
}
