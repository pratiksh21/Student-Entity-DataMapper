package com.geekster.weeklytest.project.StudentsEntityDataMapper.Repository;


import com.geekster.weeklytest.project.StudentsEntityDataMapper.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String> {
}
