package com.example.publisher.myapp.service;

import com.example.publisher.myapp.auth.UserRepository;
import com.example.publisher.myapp.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    @Autowired
    private UserRepository userRepository;


    public UserDto createUser (UserDto userDto){

        User user = new User();

         user.setName= userDto.getName();
         user.setEmail=userDto.getEmail();

         UserDto savedUser userRepository.save(user);

        UserDto saveduserDto  =new UserDto();


        saveduserDto.setName(savedUser.getname());
        saveduserDto.setEmail(savedUser.getEmail());

        return saveduserDto;


    }


}
