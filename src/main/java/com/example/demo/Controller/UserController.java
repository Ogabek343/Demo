package com.example.demo.Controller;

import com.example.demo.Moduls.User.AppUser;
import com.example.demo.Service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("/user/get/{id}")
    public ApiResponse getUser(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @DeleteMapping("/user/delete/{id}")
    public ApiResponse deleteUser(@PathVariable("id") Long id){
        return userService.deleteUser(id);
    }
    @PutMapping("/user/update/")
    public ApiResponse updateUser(@RequestBody AppUser user){
        return userService.updateUser( user);
    }

}
