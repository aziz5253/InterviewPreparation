package com.springbootinterview.demo.SpringBootInterviewPreparation.dto;

import java.time.LocalDateTime;

public class OrderSummaryDTO {

    private String orderNumber;
    private Double amount;
    private LocalDateTime orderDate;
    private String customerName;

    public OrderSummaryDTO() {}
    public OrderSummaryDTO(
            String orderNumber,
            Double amount,
            LocalDateTime orderDate,
            String customerName
    ) {
        this.orderNumber = orderNumber;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customerName = customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }
    // getters only (immutable preferred)
}
