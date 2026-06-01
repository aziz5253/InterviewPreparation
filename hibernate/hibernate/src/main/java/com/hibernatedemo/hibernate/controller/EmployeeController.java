package com.hibernatedemo.hibernate.controller;

import com.hibernatedemo.hibernate.dto.OrderItemDto;
import com.hibernatedemo.hibernate.entity.Employee;
import com.hibernatedemo.hibernate.entity.Order;
import com.hibernatedemo.hibernate.service.EmployeeService;
import com.hibernatedemo.hibernate.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    private EmployeeService empService;
    private OrderService orderService;
    EmployeeController(EmployeeService empService,OrderService orderService){
        this.empService=empService;
        this.orderService=orderService;
    }

    @PostMapping("/save")
    public void saveEmployee(){
        empService.save();
    }

    @GetMapping("/get")
    public Employee getEmployee(){
        Employee emp=empService.getEmployeeDetails();
        return emp;
    }
    @PutMapping("/updateEmployee/{empId}")
    public void updateEmployee(@PathVariable Long empId){
        empService.update(empId);
    }
    @PutMapping("/updateEmployeeByName/{empId}")
    public void updateEmployeeByName(@PathVariable Long empId){
        empService.updateName(empId);
    }
    @DeleteMapping("/deleteEmployee/{empId}")
    public void deleteEmployee(@PathVariable Long empId){
        empService.deleteEmployee(empId);
    }
    @DeleteMapping("/deleteItemByEmpId/{empId}")
    public void deleteItemByEmpId(@PathVariable Long empId){
        empService.deleteItemByEmpId(empId);
    }
    @PostMapping("/createOrder")
    public void createOrder(){
        orderService.createOrder();
    }
    @GetMapping("/retrievedOrder/{customerId}")
    public List<Order> getOrderDetails(@PathVariable Long customerId){
       return orderService.getOrderDetails(customerId);
    }
    @GetMapping("/retrievedOrderDto/{orderId}")
    public List<OrderItemDto> retrievedOrderDto(@PathVariable Long orderId){
        return orderService.findOrderItemsByOrderId(orderId);
    }
    @GetMapping("/retrievedOrderEntityGraph/{customerId}")
    public List<Order> retrievedOrderEntity(@PathVariable Long customerId){
        return orderService.findByCustomerId(customerId);
    }


}
