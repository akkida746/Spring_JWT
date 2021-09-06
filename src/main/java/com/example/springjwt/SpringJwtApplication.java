package com.example.springjwt;

import com.example.springjwt.redis.Student;
import com.example.springjwt.redis.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Optional;

//https://www.javainuse.com/spring/boot-jwt
//https://markheath.net/post/exploring-redis-with-docker
@SpringBootApplication
public class SpringJwtApplication {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			System.out.println("Running commands..");
			studentService.updateStudent("Akash");

			Optional<Student> studentOptional = studentService.getStudent("Akash");
			if(studentOptional.isPresent()){
				System.out.println(studentOptional.get());
			} else{
				System.out.println("Student not found!");
			}
		};
	}

}
