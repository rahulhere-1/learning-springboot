package com.example.learning.Learning.Spring.Boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;

    private Integer subjectName;

    @ManyToOne
    @JoinColumn( name = "teacher_id",referencedColumnName = "teacherId")
    private Teacher teacher;

}
