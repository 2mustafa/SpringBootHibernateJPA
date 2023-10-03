package com.SpringLearning.HibernateJPADemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    // 1. Define fields / this is the same as the table columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This is for auto increment
    @Column (name = "id")
    private int id;

    @Column (name = "first_name")
    private String firstname;

    @Column (name = "last_name")
    private String lastname;

    @Column (name = "email")
    private String email;

    // 2. Define constructors

    public Student (){

    }

    // id must not be included because it is auto incremented
    public Student(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    // 3. Define getter/setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // 4. Define toString method


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
