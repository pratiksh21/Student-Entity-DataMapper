package com.geekster.weeklytest.project.StudentsEntityDataMapper.Repository;


import com.geekster.weeklytest.project.StudentsEntityDataMapper.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,String> {

}