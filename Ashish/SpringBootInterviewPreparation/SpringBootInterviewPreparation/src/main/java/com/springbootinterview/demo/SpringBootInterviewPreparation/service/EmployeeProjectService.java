package com.springbootinterview.demo.SpringBootInterviewPreparation.service;

import com.springbootinterview.demo.SpringBootInterviewPreparation.dto.EmployeeProjectId;
import com.springbootinterview.demo.SpringBootInterviewPreparation.entity.EmployeeProject;
import com.springbootinterview.demo.SpringBootInterviewPreparation.repo.EmployeeProjectRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProjectService {
    private EmployeeProjectRepo employeeProjectRepo;

    public EmployeeProjectService(EmployeeProjectRepo employeeProjectRepo) {
        this.employeeProjectRepo = employeeProjectRepo;
    }

    public EmployeeProject save() {
        EmployeeProjectId id=new EmployeeProjectId(101,1001);
        EmployeeProject employeeProject=new EmployeeProject(id,"Developer",40);
        return employeeProjectRepo.save(employeeProject);
    }

}
