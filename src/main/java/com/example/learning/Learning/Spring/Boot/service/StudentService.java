package com.example.learning.Learning.Spring.Boot.service;

import com.example.learning.Learning.Spring.Boot.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(Integer studentId);

    void updateStudent(Integer id, Student student);

    Student getStudentByName(String name);

    void deleteStudent(Integer id);
}
