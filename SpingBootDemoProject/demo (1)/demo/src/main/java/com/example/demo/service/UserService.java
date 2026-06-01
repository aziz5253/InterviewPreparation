package com.example.demo.service;

import com.example.demo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserById(Long id) {
        // In a real application, you would fetch the user from a database
        if(id!=1){
            throw new UserNotFoundException("User with ID: " + id + " not found.");
        }
        return "Aziz";
    }
}
