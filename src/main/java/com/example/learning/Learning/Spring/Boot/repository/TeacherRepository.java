package com.example.learning.Learning.Spring.Boot.repository;

import com.example.learning.Learning.Spring.Boot.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    @Query(
            value = " from Teacher where teacherName = ?1 "
    )
    public Teacher getTeacherByName(String name);
}
