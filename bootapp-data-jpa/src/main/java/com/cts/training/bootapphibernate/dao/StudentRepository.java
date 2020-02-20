package com.cts.training.bootapphibernate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapphibernate.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> ,StudentRepositoryCustom  {

	// 1. Proper naming convention
	//first method for multiple
	List<Student> findStudentsByEmail(String email);
	
	//for single record
	Student findByEmail(String email);
	
	
	// 2.Using Query Annotation
	@Query("select s from Student s where s.age > :providedAge and s.gpa > :providedGpa")
	List<Student> getStudentsOfSpecificCriteria(@Param("providedAge") Integer age, @Param("providedGpa") Double gpa);
}
