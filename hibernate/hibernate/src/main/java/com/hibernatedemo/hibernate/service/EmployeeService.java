package com.hibernatedemo.hibernate.service;

import com.hibernatedemo.hibernate.entity.Employee;
import com.hibernatedemo.hibernate.entity.Item;
import com.hibernatedemo.hibernate.repo.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository repo;


    @PersistenceContext
    private EntityManager em;

    EmployeeService(EmployeeRepository repo){
        this.repo=repo;
    }
    @Transactional
    public void save() {
        Employee emp = new Employee("Aziz", 20000);
        List<Item> list=new ArrayList<>();
        Item item=new Item("Laptop",emp);
        Item item1=new Item("Mobile",emp);
        emp.addItem(item);
        emp.addItem(item1);
        repo.save(emp);
    }

    public Employee getEmployeeDetails() {

        Employee emp = repo.findById(1L).get();

        return emp;


    }

    @Transactional
    public void update(Long empId) {
        Employee e=em.find(Employee.class,empId);

        //Change the salary
        e.setSalary(2000);

        //Force sql execution
        em.flush();

        //Change again
        e.setSalary(3000);

    }

    @Transactional
    public void updateName(Long empId) {

        Employee e = em.find(Employee.class, empId);

        em.clear(); // removes all managed entities

        Employee managed=em.merge(e);
        managed.setName("John");

    }

    @Transactional
    public void deleteEmployee(Long empId) {
        Employee e = em.find(Employee.class, empId);
        em.remove(e);
    }

    @Transactional
    public void deleteItemByEmpId(Long empId) {
        Employee emp=em.find(Employee.class,8L);
        Item item=emp.getItems().get(0);
        emp.getItems().remove(item);
    }
}
