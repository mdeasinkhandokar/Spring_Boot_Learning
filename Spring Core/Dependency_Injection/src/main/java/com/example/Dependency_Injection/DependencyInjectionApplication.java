package com.example.Dependency_Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext containerObj= SpringApplication.run(DependencyInjectionApplication.class, args);

   Arrays.asList(containerObj.getBeanDefinitionNames()).forEach(System.out::println);

   Human human= containerObj.getBean(Human.class);
   human.live();


	}

}
