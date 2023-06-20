package com.simformq.jpa_practical.repository;

import com.simformq.jpa_practical.entity.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.stereotype.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {
        Course course = Course.builder()
                .title("Spring Framework")
                .credit(4)
                .build();

//        Teacher teacher = Teacher.builder()
//                .firstName("Yash")
//                .lastName("Fofdiya")
//                .courses(List.of(course))
//                .build();

//        teacherRepository.save(teacher);
    }
}