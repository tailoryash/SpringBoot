package com.simform.EmployeeManagementSystem.controller;

import com.simform.EmployeeManagementSystem.entity.Admin;
import com.simform.EmployeeManagementSystem.repository.AdminRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("loginEmp", new Admin());
        return "signup";
    }

    @PostMapping("/login")
    public String validateForm(@Valid @ModelAttribute("loginEmp") Admin admin, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
            return "/signup";
        }
        System.out.println(admin);
        admin.setRole("ADMIN");
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        adminRepository.save(admin);
        return "/";
    }
}
