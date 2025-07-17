package com.practise.spring.learn_JPA_Spring.customJdbcTemplate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "students")
public class Student {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Student() {
        // Default constructor for JPA
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
