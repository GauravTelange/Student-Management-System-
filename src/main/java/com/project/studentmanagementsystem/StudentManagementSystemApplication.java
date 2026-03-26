package com.project.studentmanagementsystem;

import com.project.studentmanagementsystem.entity.Student;
import com.project.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Gaurav","Telange","gauravtelange786@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Smit","Mewada","smewada01@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Vishwajit","Kolekar","vkolekar6@gmail.com");
//		studentRepository.save(student3);


	}
}
