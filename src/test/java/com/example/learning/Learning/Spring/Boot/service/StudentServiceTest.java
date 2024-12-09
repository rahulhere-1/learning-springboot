package com.example.learning.Learning.Spring.Boot.service;

import com.example.learning.Learning.Spring.Boot.entity.Student;
import com.example.learning.Learning.Spring.Boot.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @MockitoBean
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp(){
        Student student = Student.builder().name("rahul").age(15).grade(9).build();
        Mockito.when(studentRepository.findByName("rahul")).thenReturn(student);
    }

    @Test
    public void testWhenValidStudentNameIsGiven(){
        Student response = studentService.getStudentByName("rahul");
        String studentName = "rahul";
        assertEquals(response.getName(),studentName);
    }

}