package com.springbootinterview.demo.SpringBootInterviewPreparation.repo;

import com.springbootinterview.demo.SpringBootInterviewPreparation.dto.OrderSummaryDTO;
import com.springbootinterview.demo.SpringBootInterviewPreparation.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order,Long> {
@Query("""
        select new com.springbootinterview.demo.SpringBootInterviewPreparation.dto.OrderSummaryDTO(
         o.orderNumber, o.amount, o.orderDate, c.name) from Order o Join o.customer c where o.amount > :minAmount
        """)

    Page<OrderSummaryDTO> findOrderSummaries(@Param("minAmount") Double minAmount, Pageable pageable);
}


