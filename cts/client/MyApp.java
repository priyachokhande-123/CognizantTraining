package com.cts.client;

import java.util.Scanner;

import com.cts.example.ArrayImp;
import com.cts.example.Calculate;
import com.cts.example.Pattern;

public class MyApp {

 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number that code u want execute");
     System.out.println("1.Pattern");
     System.out.println("2.Calculate");
     System.out.println("3.ArrayImpl");
     System.out.println("Enter your choice");
    
     int choice=sc.nextInt();
     switch(choice){
     case 1:
    	 System.out.println("Enter number of rows");
    	 int rows=sc.nextInt();
    	 System.out.println("\nYour pattern is");
    	 Pattern p1=new Pattern();
    	 p1.pattern1(rows);
    	 break;
     case 2:
    	 System.out.println("Enter a number");
    	 int number=sc.nextInt();
    	 Calculate c1=new Calculate();
    	 c1.reverse(number);
    	 
    	 System.out.println("Enter a number to display digits");
    	 int number1=sc.nextInt();
    	 System.out.println("Number to digit conversion is: ");
    	 c1.words(number1);
    	 break;
     case 3:
    	 ArrayImp a1=new ArrayImp();
    	 a1.average();
    	 break;
     default:
    	 System.out.println("something went wrong!!");
    	 break;
     }
  }

}
