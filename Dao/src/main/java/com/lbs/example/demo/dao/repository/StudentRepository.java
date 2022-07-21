package com.lbs.example.demo.dao.repository;

import com.lbs.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
