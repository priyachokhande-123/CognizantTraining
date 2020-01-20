package com.cts.comparison;
import java.util.Set;
import java.util.TreeSet;

public class MyApp1 {

	public static void main(String[] args) {
		

				
				Set<Employee> emp=new TreeSet<Employee>();
				emp.add(new Employee(1,"priya","p@gmail.com"));
				emp.add(new Employee(3,"pooja","a@gmail.com"));
				emp.add(new Employee(2,"pragii","k@gmail.com"));
				emp.add(new Employee(4,"madhu","m@gmail.com"));
				emp.add(new Employee(4,"rutu","m@gmail.com"));
				System.out.println(emp);
			}


	}


