package com.example.learning.Learning.Spring.Boot.service;

import com.example.learning.Learning.Spring.Boot.entity.Student;
import com.example.learning.Learning.Spring.Boot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId){
        Optional<Student> student = studentRepository.findById(studentId);
        if(student.isPresent())
            return student.get();

        return null;
    }

    @Override
    public void updateStudent(Integer id, Student student){
        Student studentFromDB = studentRepository.findById(id).get();
        studentFromDB.setName(student.getName());
        studentFromDB.setAge(student.getAge());
        studentFromDB.setGrade(student.getGrade());
        studentRepository.save(studentFromDB);
    }

    @Override
    public Student getStudentByName(String name){
        Student response= studentRepository.findByName(name);
        return response;
    }

    @Override
    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
