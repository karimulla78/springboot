package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.test.demo.model.Student;

public interface StudentRepository  extends CrudRepository<Student, Long> {

}
