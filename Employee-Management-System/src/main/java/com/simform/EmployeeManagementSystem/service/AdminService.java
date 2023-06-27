package com.simform.EmployeeManagementSystem.service;

import com.simform.EmployeeManagementSystem.entity.*;

public interface AdminService {
    public Admin addAdminUser(Admin admin);
    public Admin adminByEmail(String email)
}
