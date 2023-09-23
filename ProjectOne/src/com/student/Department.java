package com.student;



import java.util.ArrayList;
import java.util.List;



public class Department {
    private String name;
    private List<Subject> subjects;

    public Department(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    // Method to add a subject
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
