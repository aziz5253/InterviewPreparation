package com.springbootinterview.demo.SpringBootInterviewPreparation.controller;

import com.springbootinterview.demo.SpringBootInterviewPreparation.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping(consumes="application/json",produces="application/xml")
    public User getUser(@RequestBody User user){
        return user;
    }
}
