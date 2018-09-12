package com.spring.shop.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class UserDTO {

    private String username;
    private String password;
    private String confirmPassword;
    private String email;
}
