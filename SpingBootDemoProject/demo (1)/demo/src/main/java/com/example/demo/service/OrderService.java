package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    //private PaymentService paymentService = new PaymentService();
}

