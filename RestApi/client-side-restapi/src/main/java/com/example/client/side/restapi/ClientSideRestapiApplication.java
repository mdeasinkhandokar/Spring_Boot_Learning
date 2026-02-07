package com.example.client.side.restapi;

import com.example.client.side.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientSideRestapiApplication  implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ClientSideRestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserResponse admin = userService.createUser(new UserRequest("admin","admin@gmail.com"));
		System.out.println(admin);

	}
}
