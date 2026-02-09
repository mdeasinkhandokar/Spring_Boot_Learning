package com.example.spring.data.jpa;

import com.example.spring.data.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
