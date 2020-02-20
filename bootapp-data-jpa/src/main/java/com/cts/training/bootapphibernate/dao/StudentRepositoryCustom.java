package com.cts.training.bootapphibernate.dao;

import java.util.List;

import com.cts.training.bootapphibernate.entity.Student;

public interface StudentRepositoryCustom {

	//custom method implemetation
	List<Student> someVeryComplexRequirement();
}
