package com.springbootinterview.demo.SpringBootInterviewPreparation.service;

import com.springbootinterview.demo.SpringBootInterviewPreparation.dto.OrderSummaryDTO;
import com.springbootinterview.demo.SpringBootInterviewPreparation.repo.OrderRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Page<OrderSummaryDTO> getOrders(
            Double minAmount,
            int page,
            int size,
            String sortBy
    ) {
        Pageable pageable=PageRequest.of(page,size,Sort.by(sortBy).descending());
        return orderRepository.findOrderSummaries(minAmount, pageable);
    }
}
