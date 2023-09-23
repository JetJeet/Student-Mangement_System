package com.student;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Department> departments;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for departments
    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    // Method to add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }


}