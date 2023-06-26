package com.simform.EmployeeManagementSystem.repository;

import com.simform.EmployeeManagementSystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    @Query("select u from Admin u where u.email =: email")
    public Admin getAdminByEmail(@Param("email") String email);
}
