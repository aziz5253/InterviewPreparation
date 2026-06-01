package com.hibernatedemo.hibernate.dto;

import java.math.BigDecimal;

public class OrderItemDto {

    private Long orderId;
    private String itemName;
    private int quantity;
    private BigDecimal  price;


    public OrderItemDto(Long orderId, String itemName, int quantity, BigDecimal price) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
