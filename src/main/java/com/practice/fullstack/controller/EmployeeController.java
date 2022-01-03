package com.practice.fullstack.controller;


import com.practice.fullstack.model.Employee;
import com.practice.fullstack.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        public Employee getEmployeeById(@PathVariable Long id) {
            return employeeRepo.getById(id);
          }

@PostMapping("/empSave")
    public Employee saveEmployee(@RequestBody Employee emp){
        return employeeRepo.save(emp);
        }

//   @PutMapping("/emp")

}
