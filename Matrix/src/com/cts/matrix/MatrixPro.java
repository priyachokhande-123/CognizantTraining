package com.cts.matrix;

import java.util.Scanner;

 public class MatrixPro {

	private int mat[][];
	int rows,cols;
	boolean flag=true;
	int i,j;
	int arr[][]=new int[3][3];
	public void initMetrics()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows of an array");
	rows=sc.nextInt();
	System.out.println("Enter columns of an array");
	cols=sc.nextInt();

	System.out.println("Enter the elements in the matrix");
	for(i=0;i<rows;i++){
	 for(j=0;j<cols;j++){
	  arr[i][j]=sc.nextInt();
	 }
	}
	System.out.print("The Array is :\n");
	for(i=0; i<rows; i++)
	{
	    for(j=0; j<cols; j++)
	    {
	        System.out.print(arr[i][j]+ "  ");
	    }
	    System.out.println();
	}
	}
	public boolean isUnit()
	{
	 if(rows != cols){  
	  System.out.println("Matrix should be a square matrix");  
	 }  
	 else{  
      for(i = 0; i < rows; i++){  
	   for(j = 0; j < cols; j++){  
	    if(i == j && arr[i][j] != 1){  
	      flag = false;  
	      break;  
	      }  
	    if(i != j && arr[i][j] != 0){  
	     flag = false;  
	      break;  
	      }  
       }  
	  }  
	  if(flag)  
      System.out.println("Given matrix is an identity matrix");  
	  else  
	  System.out.println("Given matrix is not an identity matrix");  
	    } 
      return flag;
		
	}
	public static void main(String args[])
	{
		MatrixPro m=new MatrixPro();
		m.initMetrics();
		m.isUnit();
	}
 }

