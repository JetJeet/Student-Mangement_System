package com.student;
public class NonTeaching extends Staff {
    private String role;

    public NonTeaching(String name, int id, String role) {
        super(name, id);
        this.role = role;
    }

    // Getter and Setter for role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
