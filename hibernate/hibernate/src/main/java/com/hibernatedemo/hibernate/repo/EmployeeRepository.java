package com.hibernatedemo.hibernate.repo;

import com.hibernatedemo.hibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    List<Employee> findBySalaryGreaterThan(double salary);
}
