package com.cts.client;
import java.util.Scanner;

import com.cts.matrix.MatrixPro;
import com.cts.matrix.RowAddition;

public class MyApp1 {

		 public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the number that code u want execute");
		     System.out.println("1.MatrixPro");
		     System.out.println("2.RowAddition");
		    
		     System.out.println("Enter your choice");
		    
		     int choice=sc.nextInt();
		     switch(choice){
		     case 1:
		    	MatrixPro m=new MatrixPro();
		 		m.initMetrics();
		 		m.isUnit();
		    	 break;
		     case 2:
		    	 RowAddition ra=new RowAddition();
		 		ra.rowAdd();
		    	 break;
		    
		     default:
		    	 System.out.println("something went wrong!!");
		    	 break;
		     }
		  }

	}


