package com.example.Employee.Dashboard.repository;

import com.example.Employee.Dashboard.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Page<Employee> findByName(String name , Pageable pageable);
}
