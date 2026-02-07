package com.example.StudentProfile.service;

import com.example.StudentProfile.model.Student;
import com.example.StudentProfile.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }



    public void addStudent(Student s) {
        studentRepo.save(s);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
