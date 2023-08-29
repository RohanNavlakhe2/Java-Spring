package com.example.spring_boot_first;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "course")
@Component
public class CourseConfiguration {

	 private String courseDb;

	public String getCourseDb() {
		return courseDb;
	}

	public void setCourseDb(String courseDb) {
		this.courseDb = courseDb;
	}
	 
	 
}
