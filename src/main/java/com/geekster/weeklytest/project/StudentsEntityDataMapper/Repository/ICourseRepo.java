package com.geekster.weeklytest.project.StudentsEntityDataMapper.Repository;


import com.geekster.weeklytest.project.StudentsEntityDataMapper.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {

}
