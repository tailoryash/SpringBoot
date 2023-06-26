package com.simform.EmployeeManagementSystem.config;

import com.simform.EmployeeManagementSystem.entity.Admin;
import com.simform.EmployeeManagementSystem.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AdminDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin adminByEmail = adminRepository.getAdminByEmail(username);
        if(adminByEmail==null){
            throw new UsernameNotFoundException("Could not found user !!");
        }
        return new CustomAdminDetails(adminByEmail);
    }
}
