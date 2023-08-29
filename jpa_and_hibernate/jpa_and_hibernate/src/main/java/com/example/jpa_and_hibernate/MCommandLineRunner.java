package com.example.jpa_and_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa_and_hibernate.citizen.spring_data_jpa.Citizen;
import com.example.jpa_and_hibernate.citizen.spring_data_jpa.CitizenSpringDataJpaRepository;
import com.example.jpa_and_hibernate.course.Course;
import com.example.jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.example.jpa_and_hibernate.student.Student;
import com.example.jpa_and_hibernate.student.jpa.StudentJpaRepository;

import jakarta.persistence.EntityExistsException;

//The run() method is called on the startup of the application.
@Component
public class MCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository courseRepo;

	@Autowired
	private StudentJpaRepository studentRepo;

	@Autowired
	private CitizenSpringDataJpaRepository citizenRepo;

	private static final String RUN = "Spring Data Jpa";

	@Override
	public void run(String... args) throws Exception {

		if (RUN.equalsIgnoreCase("SpringJdbc")) {
			// Here we want to insert a row in the table on the application startup
			courseRepo.insert(new Course(1, "Python", "Me"));
			courseRepo.insert(new Course(2, "Java", "Me"));
			// courseRepo.deleteCourse(2);

			// System.out.println(courseRepo.getCourse(1));

			var allCourses = courseRepo.getAllCourses();
			allCourses.stream().forEach(System.out::println);
		} else if (RUN.equalsIgnoreCase("Jpa")) {
			studentRepo.insertStudent(new Student(1, "Rohan"));

			Student s = new Student(2, "Arya");
			studentRepo.insertStudent(s);
			s.setName("Gautam");
			studentRepo.updateStudent(s);

			studentRepo.insertStudent(new Student(3, "Manoj"));
			studentRepo.updateStudent(new Student(3, "Anmol"));

			var allStudents = studentRepo.getAllStudents();
			allStudents.stream().forEach(System.out::println);

		} else if (RUN.equalsIgnoreCase("Spring Data Jpa")) {
			Citizen c = new Citizen(1, "Rohan", "BFEPN2278H");
			 
			
			citizenRepo.save(c);
			citizenRepo.save(new Citizen(2, "Rohan", "BFEPN2278G"));
			
			//Won't throw any error even if the id already exists.
			//it will do updation.
			citizenRepo.save(new Citizen(2, "Sau", "BFEPN2278R"));

			
			citizenRepo.addCitizen(new Citizen(23, "Rohan", "BFEPN2278G"));
			
			//Our custom implementation, this will throw EntityExistsException
			//citizenRepo.addCitizen(new Citizen(23, "Rohan", "BFEPN2278G"));
			
			citizenRepo.addCitizen(new Citizen(24, "Sau", "BFEPN2278R"));

			 
			
			System.out.println(citizenRepo.findAll());
			System.out.println(citizenRepo.findByName("Rohan"));
			citizenRepo.deleteByName("Rohan");
			System.out.println(citizenRepo.findAll());
			
			
			System.out.println(citizenRepo.existsByPanNo("BFEPN2278G"));
			System.out.println(citizenRepo.existsByPanNo("BFEPN2278R"));

		  
			 
			
			

			 
			
		}

	}

}
