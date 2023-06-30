package com.simform.dtoproject.repository;

import com.simform.dtoproject.dto.EmployeeDto;
import com.simform.dtoproject.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    @Mapping(target ="name" ,source = "name")
    @Mapping(target = "stack" , source = "stack")
    public EmployeeDto convertEmployeeToDto(Employee employee);
}
