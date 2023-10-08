package com.geekster.weeklytest.project.StudentsEntityDataMapper.Repository;


import com.geekster.weeklytest.project.StudentsEntityDataMapper.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

}
