package com.example.SpringProfiling.impl;

import com.example.SpringProfiling.service.MessageService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from DEV profile 🚧";
    }
}
