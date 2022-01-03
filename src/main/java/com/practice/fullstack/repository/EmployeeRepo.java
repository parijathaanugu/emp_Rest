package com.practice.fullstack.repository;

import com.practice.fullstack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long>   {
}
