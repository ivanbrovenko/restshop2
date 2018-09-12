package com.spring.shop.resources.impl;

import com.spring.shop.model.UserDTO;
import com.spring.shop.resources.RegistrationResource;
import com.spring.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationResourceImpl implements RegistrationResource {

    @Autowired
    private UserService userService;

    @Override
    public String register(UserDTO dto) {
        if (userService.registerUser(dto)){
            return "successful registration";
        }
        return "error";
    }
}
