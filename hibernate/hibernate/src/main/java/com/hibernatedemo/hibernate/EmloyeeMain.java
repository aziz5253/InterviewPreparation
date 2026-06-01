package com.hibernatedemo.hibernate;

import com.hibernatedemo.hibernate.entity.Employee;
import com.hibernatedemo.hibernate.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmloyeeMain {
    @Autowired
    static EmployeeRepository employeeRepository;
    public static void main(String[] args) {
        Employee emp = new Employee("Shabbir", 100000);
        employeeRepository.save(emp);



    }
}
