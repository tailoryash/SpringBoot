package com.simform.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empCode;
    private String name;
    private String email;
    private String password;
}
