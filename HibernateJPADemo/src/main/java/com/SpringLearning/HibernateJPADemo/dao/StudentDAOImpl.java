package com.SpringLearning.HibernateJPADemo.dao;

import com.SpringLearning.HibernateJPADemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// we use this annotation to tell Spring that this class is a Data Access Object (DAO) class
// @Repository is a specialization of the @Component annotation.
// It is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
public class StudentDAOImpl implements StudentDAO{



    // 1. Define fields for entity manager
    private EntityManager entityManager;


    // 2. inject the entity manager using constructor injection

    @Autowired
    public StudentDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // 3. Implement the save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
