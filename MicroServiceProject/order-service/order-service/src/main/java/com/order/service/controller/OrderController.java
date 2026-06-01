package com.order.service.controller;

import com.order.service.serviceDet.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/orders")
@RefreshScope
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public String createOrder(@PathVariable int id){
        return orderService.createOrder1(id);
    }


    @PostMapping("/createOrder")
    public String create() {
        return orderService.createOrderDetails();
    }

}
