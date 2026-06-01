package com.order.service.serviceDet;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private KafkaTemplate<String,Object> kafka;

    @CircuitBreaker(name = "userService", fallbackMethod = "fallback1")
    public CompletableFuture<String>createOrder(int id){

        //Calling USER Service

        //if (true) throw new RuntimeException("Test failure");
       /* String user=restTemplate.getForObject(
                "http://user-service/users/"+id,String.class);*/

        return CompletableFuture.supplyAsync(() -> "Order Created By "+restTemplate.getForObject("http://user-service/1", String.class));

    }
    @CircuitBreaker(name = "userService", fallbackMethod = "fallback")
    //@Retry(name = "userService")
    public String createOrder1(int id){

        //Calling USER Service
        //if (true) throw new RuntimeException("Test failure");

        String user =restTemplate.getForObject(
                    "http://user-service/users/"+id,String.class);

       return  "Order Created By "+ user;

    }


    public String fallback(int id, Throwable ex) {
        return "Fallback response due to: " + ex.getMessage()+"id==="+id;
    }


    public CompletableFuture<String> fallback1(int id,Throwable t) {
        return CompletableFuture.completedFuture("Fallback User");
    }


    public String createOrderDetails() {

        String id = UUID.randomUUID().toString();
        kafka.send("order-created",id);
        System.out.println("Order Created Event Triggered===="+id);
        return id;

    }
}
