package com.SpringLearning.HibernateJPADemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateJpaDemoApplication.class, args);
    }

    // CommandLineRunner is an interface provided by Spring Boot.
    // It allows you to run specific code on application startup.
    // @Bean is used to add CommandLineRunner to Spring Context
    @Bean
    public CommandLineRunner commandLineRunner(String... args) {
        // This Lambda Expression is used to implement the run method of CommandLineRunner
        return runner -> {
            System.out.println("Hello World");
        };
    }

}
