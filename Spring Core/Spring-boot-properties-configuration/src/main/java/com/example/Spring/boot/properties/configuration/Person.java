package com.example.Spring.boot.properties.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("${name}")
    private String name ;

    @Value("${role}")
    private String role;

    @Value("${org}")
    private String org;

    @Value("${exp}")
    private String exp;

    public void printPersonInfo(){
        System.out.println("name : "+ name + " role : "+ role + " org : "+ org + " exp " + exp);
    }
}
