package com.example.learning.Learning.Spring.Boot.repository;

import com.example.learning.Learning.Spring.Boot.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    private TestEntityManager testEntityManager;
//    @BeforeEach
//    void setUp() {
//        Student student = Student.builder().name("rohan").age(12).grade(8).build();
//        testEntityManager.persist(student);
//    }

    @Test
    public void testWhenStudentNameIsGiven(){
        Student student = studentRepository.findByName("rohan");
        assertEquals(student.getName(),"rohan");
    }

    @Test
    public void saveStudent(){
        Student student = Student.builder().name("sakshi").age(14).grade(8).build();
        studentRepository.save(student);
    }
}