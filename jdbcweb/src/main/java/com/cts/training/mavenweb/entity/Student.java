package com.cts.training.mavenweb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
// lombok annotations

@AllArgsConstructor
@ToString
public class Student {


	private int id;
	private String name;
	private String email;
public Student(Integer id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public Student() {
		super();
	}
	
	
}