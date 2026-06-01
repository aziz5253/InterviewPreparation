package com.example.SpringProfiling.impl;

import com.example.SpringProfiling.service.MessageService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from Prod profile 🚧";
    }
}
