package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.Student;
import com.test.demo.repository.StudentRepository;
import com.test.demo.service.StudentService;

//@Controller
@RestController
public class StudentController {
	
	@Autowired  
    private StudentService studentService; 
	
	@RequestMapping("/")  
	public List<Student> getAllStudents()
	{  
	        return studentService.getAllStudents();  
	}     
	@RequestMapping(value="/add-user", method=RequestMethod.POST)  
    public void addStudent(@RequestBody Student student)
    {  
		studentService.addStudent(student);  
    }  
	
	

}
