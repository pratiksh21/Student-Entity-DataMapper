package com.geekster.weeklytest.project.StudentsEntityDataMapper.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany
    @JoinTable(name ="fk_Student_course",joinColumns = @JoinColumn(name = "fk_course_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_Student_List") )
    List<Student> studentList;
}
