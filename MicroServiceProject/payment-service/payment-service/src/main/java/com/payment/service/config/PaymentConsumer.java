package com.payment.service.config;

import jakarta.annotation.PostConstruct;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    private KafkaTemplate<String,Object> kafka;


    @PostConstruct
    public void init() {
        System.out.println("✅ OrderConsumer initialized");
    }

    @KafkaListener(topics="order-created")
    public void process(String orderId){

        boolean success=true;

        if(success){
            System.out.println("Inside Order Created Event Payment Success");
            kafka.send("payment-success",orderId);
        }
        else{
            System.out.println("Inside Order Created Event Payment Failed");
            kafka.send("payment-failed",orderId);
        }

    }

    @KafkaListener(topics = "inventory-failed")
    public void refund(String orderId) {

        System.out.println("Refund done: " + orderId);

        kafka.send("payment-refunded", orderId);
    }

}
