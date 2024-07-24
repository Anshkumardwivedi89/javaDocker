package com.example.UserDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.UserDetails.repository")
public class UserDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsApplication.class, args);
	}

}
