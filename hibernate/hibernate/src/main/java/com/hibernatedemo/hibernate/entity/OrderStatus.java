package com.hibernatedemo.hibernate.entity;

public enum OrderStatus {

    CREATED,        // Order created but not yet paid
    PAID,           // Payment successful
    PROCESSING,     // Order is being prepared
    SHIPPED,        // Order shipped to customer
    DELIVERED,      // Order delivered
    COMPLETED,      // Order completed successfully
    CANCELLED,      // Order cancelled by customer/system
    FAILED          // Payment or processing failed
}
