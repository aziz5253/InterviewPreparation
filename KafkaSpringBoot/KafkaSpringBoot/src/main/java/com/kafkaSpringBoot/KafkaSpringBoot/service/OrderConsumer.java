package com.kafkaSpringBoot.KafkaSpringBoot.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics="order-topic",groupId="order-group")
    public void consume(String message){
        System.out.println("Consumed message: " + message);
    }
}
