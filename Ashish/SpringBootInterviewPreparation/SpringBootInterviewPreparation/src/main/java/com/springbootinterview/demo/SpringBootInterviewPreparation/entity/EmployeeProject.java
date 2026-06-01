package com.springbootinterview.demo.SpringBootInterviewPreparation.entity;

import com.springbootinterview.demo.SpringBootInterviewPreparation.dto.EmployeeProjectId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name= "employee_projects")
public class EmployeeProject {

    @EmbeddedId
    private EmployeeProjectId id;

    private String role;
    private Integer hoursWorked;

    public EmployeeProject() {
    }

    public EmployeeProject(EmployeeProjectId id, String role, Integer hoursWorked) {
        this.id = id;
        this.role = role;
        this.hoursWorked = hoursWorked;
    }

    public EmployeeProjectId getId() {
        return id;
    }

    public void setId(EmployeeProjectId id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
