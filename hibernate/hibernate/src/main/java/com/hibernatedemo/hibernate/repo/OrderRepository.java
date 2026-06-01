package com.hibernatedemo.hibernate.repo;

import com.hibernatedemo.hibernate.dto.OrderItemDto;
import com.hibernatedemo.hibernate.entity.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query(""" 
            Select new com.hibernatedemo.hibernate.dto.OrderItemDto(
            o.id,
            i.itemName,
            i.quantity,
            i.price
            ) from Order o
            Join o.items i
            where o.id=:orderId
            """)
    List<OrderItemDto> findOrderItemsByOrderId(@Param("orderId") Long orderId);



    @EntityGraph(attributePaths = "items")
    List<Order> findByCustomerId(Long customerId);


}
