package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");
      GreetingService greetingService =
              (GreetingService) context.getBean("myBean");
      greetingService.SayHello();

      GreetingService service = new GreetingService();


    }








}
