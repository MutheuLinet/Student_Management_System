package com.lyn.sms.service;

import java.util.List;

import com.lyn.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents(); //list all students

	Student saveStudent(Student student); //save a student to your list of students
	
	Student getStudentById(Long id); //get a student by their id
	
	Student updateStudent(Student student); //update a students details
	
	void deleteStudentById(Long id); //delete student by id
}
