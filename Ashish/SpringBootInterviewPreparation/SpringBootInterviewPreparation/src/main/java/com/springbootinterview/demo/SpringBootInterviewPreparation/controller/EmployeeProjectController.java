package com.springbootinterview.demo.SpringBootInterviewPreparation.controller;

import com.springbootinterview.demo.SpringBootInterviewPreparation.entity.EmployeeProject;
import com.springbootinterview.demo.SpringBootInterviewPreparation.service.EmployeeProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee-projects")
public class EmployeeProjectController {
    @Autowired
    private EmployeeProjectService empProjectService;

    @PostMapping("/save")
    public EmployeeProject save(){
        return empProjectService.save();
    }
}
