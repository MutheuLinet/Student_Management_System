package com.lyn.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyn.sms.entity.Student;

//dao, no @repository because the extended class has it already annotated
//the jpa repository has the crud operations methods

public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
