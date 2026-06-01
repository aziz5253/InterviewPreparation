package com.springbootinterview.demo.SpringBootInterviewPreparation.controller;

import com.springbootinterview.demo.SpringBootInterviewPreparation.dto.OrderSummaryDTO;
import com.springbootinterview.demo.SpringBootInterviewPreparation.service.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Page<OrderSummaryDTO> getOrders(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "orderDate") String sortBy,
            @RequestParam(defaultValue = "0") Double minAmount
    ) {
        return orderService.getOrders(
                minAmount,
                page,
                size,
                sortBy
        );
    }
}