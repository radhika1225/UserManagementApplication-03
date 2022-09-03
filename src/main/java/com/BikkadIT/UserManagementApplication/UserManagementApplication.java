package com.BikkadIT.UserManagementApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(UserManagementApplication.class, args);
	}

}
