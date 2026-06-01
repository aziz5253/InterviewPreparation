package com.springbootinterview.demo.SpringBootInterviewPreparation.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope("prototype")
@RequestScope
public class UserService {
    public UserService() {
        System.out.println("UserService created");
    }
}
