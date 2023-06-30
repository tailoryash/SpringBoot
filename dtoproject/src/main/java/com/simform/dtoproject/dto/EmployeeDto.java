package com.simform.dtoproject.dto;//package com.simform.dtoproject.dto;

//public record EmployeeDto(
//        String name,
//        String stack
//) {
//}

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    String name;
    String stack;
}