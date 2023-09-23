package com.student;

import java.util.ArrayList;
import java.util.List;

public class Division {
    private String name;
    private List<Student> students;

    public Division(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Getter and setter methods for name and students
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
