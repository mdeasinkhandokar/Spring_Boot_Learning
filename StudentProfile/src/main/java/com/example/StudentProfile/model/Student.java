package com.example.StudentProfile.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    private int RollNo;
    private String StudentName;
    private int Marks;


    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", StudentName='" + StudentName + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
