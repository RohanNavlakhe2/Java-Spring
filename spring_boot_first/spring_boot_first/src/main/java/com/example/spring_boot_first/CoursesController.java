package com.example.spring_boot_first;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

	@Autowired
	private CourseConfiguration courseConfiguration;
	
	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return Arrays.asList(
				new Course(1, "Java",2000),
				new Course(2, "Spring",3000),
				new Course(3, "Python",3000),
				new Course(4, "Nodejs",2500),
				new Course(5, "JavaScript",1800)
				);
	}
	
	@RequestMapping("/courses-db")
	public String getCourseDb() {
		return courseConfiguration.getCourseDb();
	}

}
