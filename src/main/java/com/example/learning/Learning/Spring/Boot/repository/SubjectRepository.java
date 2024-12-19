package com.example.learning.Learning.Spring.Boot.repository;

import com.example.learning.Learning.Spring.Boot.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
