package org.t2404e.salarymanagementapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.t2404e.salarymanagementapp.Entity.Employee;
import org.t2404e.salarymanagementapp.Repository.EmployeeRepository;

@SpringBootApplication
public class SalaryManagementAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SalaryManagementAppApplication.class, args);
    }
    @Bean
    public CommandLineRunner loadData(EmployeeRepository employeeRepository) {
        return args -> {
            repository.save(new Employee(null, "John Doe", "john@example.com", "Developer", 1000));
            repository.save(new Employee(null, "Jane Smith", "jane@example.com", "Manager", 2000));
            repository.save(new Employee(null, "Alice Brown", "alice@example.com", "Tester", 900));
            repository.save(new Employee(null, "Bob Johnson", "bob@example.com", "Designer", 1200));
            repository.save(new Employee(null, "Charlie White", "charlie@example.com", "Developer", 1100));
        }
    }

}
