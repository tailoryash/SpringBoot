package com.simformq.jpa_practical.repository;

import com.simformq.jpa_practical.entity.*;
import jakarta.transaction.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByFirstName(String name);

    public List<Student> findByFirstNameContaining(String name);

    public List<Student> findByGuardianName(String guardianName);

    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);

    @Modifying
    @Transactional
    @Query(
            value = "update student_details set first_name=?1 where email_address=?2",
            nativeQuery = true
    )
    void updateStudentNameByEmail(String firstName, String emailId);

}
