package com.SpringLearning.HibernateJPADemo.dao;

import com.SpringLearning.HibernateJPADemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// we use this annotation to tell Spring that this class is a Data Access Object (DAO) class
// @Repository is a specialization of the @Component annotation.
// It is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
public class StudentDAOImpl implements StudentDAO {


    // 1. Define fields for entity manager
    private EntityManager entityManager;


    // 2. inject the entity manager using constructor injection

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // 3. Implement the save method
    @Override
    @Transactional
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

    // 4. Implement the findById method
    @Override
    public Student findStudentById(Integer id) {
        //  The find method is typically used to look up entities by their primary key (ID)
        return entityManager.find(Student.class, id);
    }

    // 5. Implement the findByLastName method using a JPQL query
    @Override
    public List<Student> findStudentByLastName(String lastName) {
        // create a query
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s WHERE s.lastname = :lastname", Student.class);
        // set parameter values
        query.setParameter("lastname", lastName);
        // execute query and get result list
        List<Student> students = query.getResultList();
        // return the results
        return students;
    }



    // 6. Implement the findAll method using a native query
    @Override
    public List<Student> findAllStudents() {
        // create a query
        Query query = entityManager.createNativeQuery("SELECT * FROM Student", Student.class);
        // execute the query and get the result list
        List<Student> students = query.getResultList();
        // return the list
        return students;
    }


}
