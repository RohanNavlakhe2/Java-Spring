package com.example.jpa_and_hibernate.student.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.jpa_and_hibernate.student.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional //This annotations is required when we work with EntityManager
public class StudentJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insertStudent(Student student) {
		//If we want to prevent duplicates (we won't be able to 
		//add two student with same id) then use persist
		entityManager.persist(student);
	}
	
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}
	
	public Student getStudentById(int id) {
		return entityManager.find(Student.class,id);
	}
	
	public void deleteStudentById(int id) {
		var student = entityManager.find(Student.class,id);
		entityManager.remove(student);
	}
	
	public List<Student> getAllStudents() {
		//we cannot use "select *" like sql query in jpa
		TypedQuery<Student> query = entityManager.createQuery("select s from Student s",Student.class);
		return query.getResultList();
	}

}
