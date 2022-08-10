package com.lyn.sms.service;

import java.util.List;

import com.lyn.sms.entity.Student;

public interface StudentService {
	
	List< Student > getAllStudents();

	Student saveStudent(Student student);
}
