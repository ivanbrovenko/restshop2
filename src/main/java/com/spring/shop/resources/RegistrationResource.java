package com.spring.shop.resources;


import com.spring.shop.model.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegistrationResource {

    @PostMapping("/reg")
    String register(@RequestBody UserDTO dto);
}
