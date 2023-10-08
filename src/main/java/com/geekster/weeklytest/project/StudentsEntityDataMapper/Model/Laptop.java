package com.geekster.weeklytest.project.StudentsEntityDataMapper.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;

    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;
    @OneToOne
    @JoinColumn(name = "fK_Student_id")
    private Student student;
}
