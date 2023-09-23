package com.student;

public class Teacher extends Staff {
    private String subjectTaught;

    public Teacher(String name, int id, String subjectTaught) {
        super(name, id);
        this.subjectTaught = subjectTaught;
    }

    // Getter and Setter for subjectTaught
    public String getSubjectTaught() {
        return subjectTaught;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }
}

