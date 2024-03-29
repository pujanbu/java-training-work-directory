package com.vastika.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vastika.demo.model.Student;

@Repository 
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
