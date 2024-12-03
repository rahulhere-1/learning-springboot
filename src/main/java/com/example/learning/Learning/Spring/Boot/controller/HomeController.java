package com.example.learning.Learning.Spring.Boot.controller;

import com.example.learning.Learning.Spring.Boot.entity.Student;
import com.example.learning.Learning.Spring.Boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/")
    public String home(){
        return "hello-world";
    }

    @GetMapping("/strings")

    public List<String> getStringList(){
        return Arrays.asList("this","that","world");
    }

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Integer id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/student/update")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student.getStudentId(),student);
    }

    @PutMapping("/student/{name}")
    public Student getStudentByName(@PathVariable("name") String name){
        return studentService.getStudentByName(name);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable("id") Integer studentId){
        studentService.deleteStudent(studentId);
    }

}
