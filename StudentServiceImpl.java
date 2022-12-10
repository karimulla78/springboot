package com.test.demo.service.impl;

import com.test.demo.service.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.model.Student;
import com.test.demo.repository.StudentRepository; 

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired  
	private StudentRepository studentrRepository;  
	
/*	@Autowired
    public StudentServiceImpl(StudentRepository studentrRepository) {
        this.studentrRepository = studentrRepository;
    }*/
	
	
	
	public void addStudent(Student student)
	{  
		studentrRepository.save(student);  
	}  
	
	public List<Student> getAllStudents() {
		 
		List<Student> students = new ArrayList<Student>();  
		studentrRepository.findAll().forEach(i -> students.add(i));  
		return students;  
		
	}

}


 
  