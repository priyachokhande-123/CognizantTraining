package com.cts.comparison;

import java.util.Set;
import java.util.TreeSet;

public class MyApp {

	public static void main(String[] args) {
		
		Set<Student> Students=new TreeSet<Student>();
		Students.add(new Student(1,"priya","p@gmail.com"));
		Students.add(new Student(3,"pooja","a@gmail.com"));
		Students.add(new Student(2,"pragii","k@gmail.com"));
		Students.add(new Student(4,"madhu","m@gmail.com"));
		Students.add(new Student(4,"rutu","m@gmail.com"));
		System.out.println(Students);
	}

}
