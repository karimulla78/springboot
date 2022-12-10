package com.test.demo.service;

import java.util.List;

import com.test.demo.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public void addStudent(Student student);

}
