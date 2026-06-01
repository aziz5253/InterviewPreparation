package com.hibernatedemo.hibernate.service;

import com.hibernatedemo.hibernate.dto.OrderItemDto;
import com.hibernatedemo.hibernate.entity.Customer;
import com.hibernatedemo.hibernate.entity.Order;
import com.hibernatedemo.hibernate.entity.OrderItem;
import com.hibernatedemo.hibernate.entity.OrderStatus;
import com.hibernatedemo.hibernate.repo.OrderRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private OrderRepository or;

    @Transactional
    public void createOrder() {
        Customer cust=new Customer();
        cust.setName("Aziz");

        Order order=new Order();
        order.setCustomer(cust);
        order.setStatus(OrderStatus.CREATED);
        order.setCreatedAt(LocalDateTime.now());

        OrderItem item1=new OrderItem();
        item1.setItemName("Laptop");
        item1.setQuantity(1);
        item1.setPrice(new BigDecimal("75000"));
        item1.setOrder(order);

        OrderItem item2=new OrderItem();
        item2.setItemName("Mouse");
        item2.setQuantity(2);
        item2.setPrice(new BigDecimal("1500"));
        item2.setOrder(order);

        order.getItems().add(item1);
        order.getItems().add(item2);

        cust.getOrders().add(order);

        em.persist(cust);




    }
    public List<Order> getOrderDetails(Long customerId){

        List<Order> orders = em
                .createQuery("\n" +
                        "SELECT DISTINCT o\n" +
                        "FROM Order o\n" +
                        "JOIN FETCH o.items\n" +
                        "WHERE o.customer.id = :customerId\n", Order.class)
                .setParameter("customerId",customerId)
                .getResultList();



        return orders;
    }
    public List<OrderItemDto> findOrderItemsByOrderId(Long orderId){
        return or.findOrderItemsByOrderId(orderId);
    }

    public List<Order> findByCustomerId(Long customerId) {
        return or.findByCustomerId(customerId);
    }
}
