package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner setup(EmployeeRepository employeeRepository) {
        return (args) -> {
            employeeRepository.save(new Employee("Oscar", "Castillo", true));
            employeeRepository.save(new Employee("Michel", "Hinostroza", true));
            employeeRepository.save(new Employee("Gustavo ", "Algo", false));
            employeeRepository.save(new Employee("Abhi", "S.", true));
            logger.info("Employees setup bean injected");
        };
    }
}
