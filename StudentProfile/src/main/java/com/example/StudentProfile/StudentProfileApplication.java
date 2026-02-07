package com.example.StudentProfile;

import com.example.StudentProfile.model.Student;
import com.example.StudentProfile.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class StudentProfileApplication {

	public static void main(String[] args) {


	ApplicationContext context= SpringApplication.run(StudentProfileApplication.class, args);

	 Student s=context.getBean(Student.class);
	 s.setRollNo(101);
	 s.setStudentName("Easin");
	 s.setMarks(79);


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);


		List<Student> students= service.getStudents();
		System.out.println(students);



	}

}
