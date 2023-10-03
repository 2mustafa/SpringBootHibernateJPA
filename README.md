# SpringBootHibernateJPA



Reduce logging level to warn:
      logging.level.root=warn


      
connecting spring boot to database using hibernate:
      spring.datasource.url=jdbc:mysql://localhost:3306/student_tracker
      spring.datasource.username=springstudent
      spring.datasource.password=springstudent



CommandLineRunner:
CommandLineRunner in Spring Boot as a specialized version of the Runnable interface, tailored specifically for executing code when a Spring Boot application starts up. While both CommandLineRunner and Runnable involve running tasks or code, they serve different purposes:
Runnable is a more general interface in Java used to define tasks that can be executed in their threads. It's not specific to Spring Boot and can be used in any Java application.
CommandLineRunner is a Spring Boot-specific interface that extends the Runnable interface. It's designed to allow you to define code that should run when a Spring Boot application starts, making it more specialized for application initialization and startup tasks.
here is the syntax with lambda expression:
      @Bean
      public CommandLineRunner myCommandLineRunner() {
          return (String... args) -> {
              // Your startup code here
          };
      }
