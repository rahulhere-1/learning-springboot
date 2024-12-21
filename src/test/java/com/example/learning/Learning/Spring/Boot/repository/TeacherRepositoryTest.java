package com.example.learning.Learning.Spring.Boot.repository;

import com.example.learning.Learning.Spring.Boot.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void whenValidTeacherNameIsGiven(){
        String teacherName = "Ritu";
        Teacher teacher  = teacherRepository.getTeacherByName(teacherName);
        assertEquals(teacher.getTeacherName(),teacherName);
    }


}