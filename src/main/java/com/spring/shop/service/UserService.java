package com.spring.shop.service;


import com.spring.shop.model.User;
import com.spring.shop.model.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getUsers();

    boolean registerUser(UserDTO userDTO);
}
