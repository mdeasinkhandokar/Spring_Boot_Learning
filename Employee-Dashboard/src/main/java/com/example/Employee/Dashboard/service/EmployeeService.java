package com.example.Employee.Dashboard.service;

import com.example.Employee.Dashboard.model.Employee;
import com.example.Employee.Dashboard.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRespository;
    public List<Employee> fetchAllEmployees(PageRequest pageable, String search) {
        if(search== null){
            return employeeRespository.findAll(pageable).getContent();

        }else{
            return employeeRespository.findByName(search,pageable).getContent();
        }

    }
}
