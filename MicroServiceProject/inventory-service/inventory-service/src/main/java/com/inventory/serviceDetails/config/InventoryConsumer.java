package com.inventory.serviceDetails.config;

import jakarta.annotation.PostConstruct;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class InventoryConsumer {

    private KafkaTemplate<String,Object> kafka;


    @PostConstruct
    public void init() {
        System.out.println("✅ OrderConsumer initialized");
    }

    @KafkaListener(topics="payment-success")
    public void reserve(String orderId){
        boolean success=true;

        if(success){
            System.out.println("Inside Inventory Payment Succes Event");
            kafka.send("inventory-success",orderId);
        }
        else{
            System.out.println("Inside Inventory Payment Failed Event");
            kafka.send("inventory-failed",orderId);
        }
    }

}
