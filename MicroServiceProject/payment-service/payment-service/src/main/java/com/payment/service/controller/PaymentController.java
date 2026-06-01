package com.payment.service.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@RefreshScope
public class PaymentController {

    @GetMapping("/{id}")
    public String pay(@PathVariable int id) {
        return "Payment success for " + id;
    }

}
