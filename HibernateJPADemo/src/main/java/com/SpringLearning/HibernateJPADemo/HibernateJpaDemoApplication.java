package com.SpringLearning.HibernateJPADemo;

import com.SpringLearning.HibernateJPADemo.dao.StudentDAO;
import com.SpringLearning.HibernateJPADemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateJpaDemoApplication.class, args);
    }

    // inject the StudentDAO. This is possible because we have annotated the StudentDAOImpl with @Repository
    // When the application starts, Spring will inject a StudentDAO bean automatically.
    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        // The lambda expression creates a runner object and calls createStudent with the injected StudentDAO.
        return runner -> {
            createStudent(studentDAO);
        };
    }


    // This method creates a student object, saves it to the database and retrieves it from the database
    // We will use the save method from the StudentDAO to save the student to the database
    private void createStudent (StudentDAO studentDAO){
        // 1. Create a student object
        System.out.println("Creating a new student object");
        Student  student1 = new Student("Paul", "Doa", "pauldoe@gmail.com");

        // 2. Save the student to the database
        System.out.println("saving the student");
        studentDAO.save(student1);

        // 3. Retrieve the saved student from the database
        System.out.println("saved the student with the id: " + student1.getId());

    }
}
