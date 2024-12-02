package com.example.learning.Learning.Spring.Boot.repository;

import com.example.learning.Learning.Spring.Boot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "  from Student WHERE name = ?1 ")
    public Student findByName(String name);
}
