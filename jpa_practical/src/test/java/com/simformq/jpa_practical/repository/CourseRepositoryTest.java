package com.simformq.jpa_practical.repository;

import com.simformq.jpa_practical.entity.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println("Courses list" + courseList);
    }

    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher = Teacher.builder()
                .firstName("Kinjal")
                .lastName("Rawal")
                .build();

        Course course = Course.builder()
                .title("Java")
                .credit(5)
                .teacher(teacher)
                .build();

        courseRepository.save(course);
    }
}