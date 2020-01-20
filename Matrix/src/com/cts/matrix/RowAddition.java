package com.cts.matrix;
import java.util.Scanner;

public class RowAddition {

        int mat[][]=new int[3][3];
		int rows,cols;
		int i,j;

		public void rowAdd()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows of an array");
		rows=sc.nextInt();
		System.out.println("Enter columns of an array");
		cols=sc.nextInt();

		System.out.println("Enter the elements in the matrix");
		for(i=0;i<rows;i++)
		{
		for(j=0;j<cols;j++)
		{
		mat[i][j]=sc.nextInt();

		}
		}
		System.out.print("The matrix is :\n");
		for(i=0; i<rows; i++)
		{
		   for(j=0; j<cols; j++)
		   {
		       System.out.print(mat[i][j]+ "  ");
		   }
		   System.out.println();
		}

		for(int i = 0; i < rows; i++){  
		          int sumRow = 0;  
		           for(int j = 0; j < cols; j++){  
		             sumRow = sumRow + mat[i][j];  
		           }  
		           System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
		       }  
		}

		/*public static void main(String[] args) {
		RowAddition ra=new RowAddition();
		ra.rowAdd();
		}*/
		}




