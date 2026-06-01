package com.example.SpringProfiling.entity;

@Entity
public class Order {

    @Id
    private Long id;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> items;
}
