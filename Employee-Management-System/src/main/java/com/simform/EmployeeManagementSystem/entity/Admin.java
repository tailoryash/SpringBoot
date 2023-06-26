package com.simform.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empCode;
    @NotBlank(message = "Employee name can't be empty")
    private String name;
    @Email(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid Email")
    private String email;
    @NotBlank(message = "Employee password can't be empty")
    @Size(min = 3, max = 12, message = "Password must be between 3-12 characters !!")
    private String password;
    private String role;
}
