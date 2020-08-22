package com.openapi3.example;

import com.openapi3.example.Model.Student;
import com.openapi3.example.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Openapi3Application implements ApplicationRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Openapi3Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args){
		Arrays.asList(
				Student.builder().id(1).username("username1").email("email1@example.com").build(),
				Student.builder().id(2).username("username2").email("email3@example.com").build(),
				Student.builder().id(3).username("username3").email("email3@example.com").build(),
				Student.builder().id(4).username("username4").email("email4@example.com").build()
		).forEach(studentRepository::save);
	}
}
