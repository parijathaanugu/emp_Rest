package com.practice.fullstack.controller;


import com.practice.fullstack.model.Employee;
import com.practice.fullstack.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepo.findById(id);

    }

    @PostMapping("/empSave")
    public Employee saveEmployee(@RequestBody Employee emp) {
        return employeeRepo.save(emp);
    }

    @PutMapping("/employees/{id}")
    Optional<Employee> replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return employeeRepo.findById(id)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setLastName(newEmployee.getLastName());
                    employee.setEmail(newEmployee.getEmail());
                    return employeeRepo.save(employee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        employeeRepo.deleteById(id);
    }
}
