package com.kafkaSpringBoot.KafkaSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    @Autowired
    public KafkaTemplate<String,String> kafkaTemplate;

    private static final String TOPIC = "order-topic";

    public void sendOrder(String orderId){
        kafkaTemplate.send(TOPIC,orderId,"Order placed: " + orderId);
    }
}
