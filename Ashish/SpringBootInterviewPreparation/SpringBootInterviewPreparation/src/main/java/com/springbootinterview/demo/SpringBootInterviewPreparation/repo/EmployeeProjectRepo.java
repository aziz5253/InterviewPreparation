package com.springbootinterview.demo.SpringBootInterviewPreparation.repo;

import com.springbootinterview.demo.SpringBootInterviewPreparation.dto.EmployeeProjectId;
import com.springbootinterview.demo.SpringBootInterviewPreparation.entity.EmployeeProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeProjectRepo extends JpaRepository<EmployeeProject, EmployeeProjectId> {
}
