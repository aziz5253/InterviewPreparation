package com.kafkaSpringBoot.KafkaSpringBoot.controller;

import com.kafkaSpringBoot.KafkaSpringBoot.service.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {


    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }



    @PostMapping("/postOrder/{orderId}")
    public String placeOrder(@PathVariable String orderId) {
        orderProducer.sendOrder(orderId);
        return "Order sent to Kafka";
    }


}
