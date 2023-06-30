package com.simform.dtoproject.service;

import com.simform.dtoproject.dto.EmployeeDto;
//import com.simform.dtoproject.dto.EmployeeDtoMapper;
import com.simform.dtoproject.entity.Employee;
import com.simform.dtoproject.repository.EmployeeRepository;
import com.simform.dtoproject.repository.MapStructMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    MapStructMapper mapStructMapper;

//    @Autowired
//    ModelMapper modelMapper;

//    @Autowired
//    EmployeeDtoMapper employeeDtoMapper;


    public Employee create(Employee employee) {
       return employeeRepository.save(employee);
    }

//    public List<EmployeeDto> getAllEmployees() {
//        List<EmployeeDto> collect = employeeRepository.findAll().stream().map(employee -> modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());
//        return collect;
//    }

    public List<EmployeeDto> getAllEmployees() {
         List<EmployeeDto> collect = employeeRepository.findAll().stream().map(employee -> mapStructMapper.convertEmployeeToDto(employee)).collect(Collectors.toList());
        return collect;
    }
}
