package com.example.spring.data.jpa;

import com.example.spring.data.jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  SpringDataJpaApplication {

	public static void main(String[] args) {

	ApplicationContext context  =
			SpringApplication.run(SpringDataJpaApplication.class, args);
	Student s1= context.getBean(Student.class);
	Student s2= context.getBean(Student.class);
	Student s3= context.getBean(Student.class);
	StudentRepo repo= context.getBean(StudentRepo.class);

	  s1.setRollNo(101);
	  s1.setName("Easin");
	  s1.setMarks(76);

		s2.setRollNo(111);
		s2.setName("Sanim");
		s2.setMarks(86);

		s3.setRollNo(121);
		s3.setName("Shafin");
		s3.setMarks(96);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);





	}

}
