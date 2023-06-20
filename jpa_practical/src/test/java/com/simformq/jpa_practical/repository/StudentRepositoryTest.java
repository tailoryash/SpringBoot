package com.simformq.jpa_practical.repository;

import com.simformq.jpa_practical.entity.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.data.jdbc.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){

        Guardian guardian = Guardian.builder()
                .email("guardian@gmail.com")
                .name("guardian2")
                .mobile("1234567890")
                .build();
        Student student = Student.builder()
        .emailId("arpit@gmail.com")
                .firstName("arpit")
                .lastName("panchal")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> allStudents = studentRepository.findAll();
        System.out.println("Student List : " + allStudents);
    }
    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("arpit");
//        System.out.println("Students = " + students);
        List<Student> students1 = studentRepository.findByFirstNameContaining("a");
        System.out.println(students1);
    }

    @Test
    public void printStudentsByGuardianName(){
        List<Student> studentList = studentRepository.findByGuardianName("guardian1");
        System.out.println(studentList);
    }

    @Test
    public void printStudentsByEmail(){
        Student studentByEmailAddress = studentRepository.getStudentByEmailAddress("yash@gmail.com");
        System.out.println("Students =  "+studentByEmailAddress);
    }
    @Test
    public void printStudentFirstNameByEmail(){
        String studentFirstNameByEmailAddress = studentRepository.getStudentFirstNameByEmailAddress("yash@gmail.com");
        System.out.println(studentFirstNameByEmailAddress);
    }

    @Test
    public void updateFirstNameUsingEmailId(){
        studentRepository.updateStudentNameByEmail(
                "Yash Fofdiya",
                "yash@gmail.com"
        );
    }
}
