package com.lyn.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lyn.sms.entity.Student;
import com.lyn.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Stacy", "Osanjo", "stace@gmail.com");
//		studentRepository.save(s1);
//		Student s2 = new Student("Frank", "Musembi", "fmusembi@gmail.com");
//		studentRepository.save(s2);
//		Student s3 = new Student("Duncan", "Njeri", "duncan@gmail.com");
//		studentRepository.save(s3);
	}
	
}
