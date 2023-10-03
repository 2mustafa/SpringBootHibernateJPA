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


Map a class to database table using JPA:
        @Entity
        @Table(name="student")
        public class Student {
            // 1. Define fields / this is the same as the table columns
            // 2. Define constructors
            // 3. Define getter/setter methods
            // 4. Define toString method
        }

@GeneratedValue(strategy = GenerationType.IDENTITY) // This is for auto increment used for primary key


"Setting Up JPA Data Access with CRUD Operations."
    1. Entity Class:
        Create an entity class (e.g., Student) to represent the data you want to store in the database. Annotate it with JPA annotations to map it to a database table.

    2. DAO Interface:
        Create a DAO (Data Access Object) interface (e.g., StudentDAO) to define the methods for interacting with the database. In your case, it defines the save method.

    3. DAO Implementation Class:
        Create an implementation of the DAO interface (e.g., StudentDAOImpl) and annotate it with @Repository to indicate that it's a repository. Inject an EntityManager or JpaRepository to interact
        with the database.

    4. CommandLineRunner Bean:
       Define a CommandLineRunner bean in your application class. This bean takes the StudentDAO as a parameter and specifies the logic to run during application startup.

    5. Test the Application:
        Run the application and test it by saving a Student object to the database.