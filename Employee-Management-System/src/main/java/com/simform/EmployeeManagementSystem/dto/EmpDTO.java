package com.simform.EmployeeManagementSystem.dto;

import lombok.*;

@Data
@NoArgsConstructor
public class EmpDTO {
    private int id;
    private String name;
    private String email;
    private String department;
}
