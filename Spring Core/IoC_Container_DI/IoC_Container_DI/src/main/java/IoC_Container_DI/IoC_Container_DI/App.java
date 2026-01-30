package IoC_Container_DI.IoC_Container_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class App {
    public static void  main(String[] args){

//        Computer computer = new Computer();
//        Keyboard keyboard= new Keyboard();
//        computer.setKeyboard(new Keyboard());

//        ApplicationContext container = new AnnotationConfigApplicationContext(App.class);
        SpringApplication springApplication= new SpringApplication(App.class);
        ApplicationContext container= springApplication.run();

        Computer computer=container.getBean(Computer.class);
        computer.start();


    }
}
