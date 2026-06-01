package com.springbootinterview.demo.SpringBootInterviewPreparation.dto;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeeProjectId implements Serializable {
    private Integer empId;
    private Integer projectId;

    public EmployeeProjectId() {
    }

    public EmployeeProjectId(Integer empId, Integer projectId) {
        this.empId = empId;
        this.projectId = projectId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeProjectId that = (EmployeeProjectId) o;
        return Objects.equals(empId, that.empId) && Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, projectId);
    }
}
