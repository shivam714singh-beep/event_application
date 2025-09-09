package com.example.publisher.myapp.controller;

import com.example.publisher.myapp.dto.UserDto;
import com.example.publisher.myapp.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Userservice userservice;

    public ReponseEntity<UserDto> createUser(@RequestBody UserDto userDto){


        UserDto savedUser = userservice.createUser(userDto);

        return ResponseEntity(HttpStatus.CREATED).body(savedUser);

    }
}
