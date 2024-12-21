package com.example.learning.Learning.Spring.Boot.repository;

import com.example.learning.Learning.Spring.Boot.entity.Subject;
import com.example.learning.Learning.Spring.Boot.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SubjectRepositoryTest {

    @Autowired
    private SubjectRepository subjectRepository;

    @Test
    public void saveSubject(){
        Teacher teacher = Teacher.builder().teacherName("Ritu").age(34).build();
        Subject subject = Subject.builder().subjectName("Maths").teacher(teacher).build();
        subjectRepository.save(subject);
    }

    @Test
    public void whenValidSubjectNameIsGiven(){
            String subjectName = "Maths";
            Subject response = subjectRepository.findBySubjectName(subjectName);
            assertEquals(subjectName,response.getSubjectName());
    }
}