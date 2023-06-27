package com.simform.EmployeeManagementSystem.service;

import com.simform.EmployeeManagementSystem.entity.*;
import com.simform.EmployeeManagementSystem.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository adminRepository;
    public Admin addAdminUser(Admin admin) {
       return adminRepository.save(admin);
    }
}
