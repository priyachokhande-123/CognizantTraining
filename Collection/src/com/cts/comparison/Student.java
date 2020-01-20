package com.cts.comparison;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String email;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	@Override
	public int compareTo(Student other) {
		
		return this.id-other.id;
	}
	
	
}
