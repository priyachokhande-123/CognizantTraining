package com.cts.example;

public class Pattern 
{
	public void pattern1(int rows){
	 int i,j;
	 for(i=1;i<=rows;i++){
			 
	 for(j=1;j<=rows-i;j++){
	  System.out.printf(" ");
	 } 
	 
	 for(j=1;j<=i;j++){
	  System.out.printf("%d",j);
	 } 
	 
	 for(j=i-1;j>=1;j--){
	  System.out.printf("%d",j);
	 }
	 
	  System.out.println();
	 }
	}
	public void pattern2(int rows)
	{
		
	}
	public void pattern3(int rows)
	{
		
	}
}

/*public static void main(String args[])
	    { 
	        int rows = 5; 
	        pattern1(rows); 
	    }  
}
*/