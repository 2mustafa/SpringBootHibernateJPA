package com.SpringLearning.HibernateJPADemo.dao;

import com.SpringLearning.HibernateJPADemo.entity.Student;

// This is an interface to define the methods that we will use to interact with the database
public interface StudentDAO {
    // we create a method to save a student to the database. The method will take a Student object as a parameter
    // Student student (parameter type and name)
    // Student is the entity class that we created
    // student is the object that we will save to the database
    public void save (Student student);
}
