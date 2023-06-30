package com.simform.dtoproject.controller;

import com.simform.dtoproject.dto.EmployeeDto;
import com.simform.dtoproject.entity.Employee;
import com.simform.dtoproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Employees")
public class MainController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.create(employee), HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<List<EmployeeDto>> getAllEmployees () {
        List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
        return new ResponseEntity<>(allEmployees,HttpStatus.FOUND);
    }
}
