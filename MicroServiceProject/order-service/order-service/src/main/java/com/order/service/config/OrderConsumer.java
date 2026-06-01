package com.order.service.config;

import jakarta.annotation.PostConstruct;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {


    @PostConstruct
    public void init() {
        System.out.println("✅ OrderConsumer initialized");
    }

    @KafkaListener(topics="payment-failed")
    public void cancel(String orderId){
        System.out.println("OrderConsumer.cancel"+ orderId);
    }

    @KafkaListener(topics="inventory-success")
    public void confirm(String orderId){
        System.out.println("Order Confirmed=="+orderId);
    }

    @KafkaListener(topics="payment-refunded")
    public void cancelAfterRefund(String orderId) {
        System.out.println("Order Cancelled after refund: " + orderId);
    }

}
