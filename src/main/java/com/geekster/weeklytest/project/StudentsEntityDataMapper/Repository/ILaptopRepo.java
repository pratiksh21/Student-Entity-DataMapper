package com.geekster.weeklytest.project.StudentsEntityDataMapper.Repository;

import com.geekster.weeklytest.project.StudentsEntityDataMapper.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,String>{

}