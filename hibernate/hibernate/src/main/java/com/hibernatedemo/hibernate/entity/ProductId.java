package com.hibernatedemo.hibernate.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProductId implements Serializable {
    private Long productId;
    private Long orderId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
