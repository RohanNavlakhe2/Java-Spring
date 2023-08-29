package com.example.jpa_and_hibernate.course.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY = """
			 insert into course(id,name,author)
			 values(?,?,?);
			""";
	
	private static String DELETE_QUERY = """
			delete from course WHERE id=?
		""";
	
	private static String SELECT_COURSE_BY_ID_QUERY = """
			SELECT * FROM course
			WHERE id=?
			""";
	
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY,
				course.getId(),course.getName(),null);
	}
	
	public void deleteCourse(long courseId) {
		jdbcTemplate.update(DELETE_QUERY,courseId);
	}
	
	public Course getCourse(long courseId) {
		return jdbcTemplate.queryForObject(SELECT_COURSE_BY_ID_QUERY,
				new BeanPropertyRowMapper<>(Course.class),courseId);
	}
	
	public List<Course> getAllCourses(){
		return jdbcTemplate.query("select * from course",
				new BeanPropertyRowMapper<>(Course.class));
	}
}
