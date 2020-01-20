package com.cts.example;

import java.util.Scanner;

public class ArrayImp{

public void average(){
	
int j=0;
int count=0;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
int n = sc.nextInt();
int arr[] = new int[n];
 System.out.println("Enter the elements:");
  for(int i = 0; i <n; i++)
  arr[i] = sc.nextInt();
	  
  for(int i = 0; i <arr.length ; i++){
   if(arr[i]%5==0) {
    sum=sum+arr[i];
	count++;
	}
 }
 System.out.println("average is" +sum/count);
 }
	  

public static void min(){
int index = 0;
				Scanner sc=new Scanner(System.in);
			System.out.print("Enter no. of elements you want in array:");
				int n = sc.nextInt();
				
				int arr[] = new int[n];
				int min=arr[0];
				

			System.out.println("Enter the elements:");
					  for(int i = 0; i <n; i++)
					     arr[i] = sc.nextInt();

					  
					   for(int i=0;i<arr.length;i++)
					   {
						   if(min>arr[i])
						   {
							   min=arr[i];
							  index=i;
						   }
					   }
					   
						System.out.println(index);
					   }	
 
 public void array3()
  {
		
  }

}
