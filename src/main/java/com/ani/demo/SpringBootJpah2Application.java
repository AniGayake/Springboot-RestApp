package com.ani.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootJpah2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpah2Application.class, args);
	}

}
