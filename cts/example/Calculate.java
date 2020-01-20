package com.cts.example;

public class Calculate {
 
	public int reverse(int number)
	{
	 int rev=0;
	  while(number!=0)
	   {
		 rev=rev*10;
    	 rev=rev+ number %10;
		 number=number/10;
		}	
	   System.out.println("Reverse number is" +rev);
	    	return number;
	}
	
	public int words(int number)
	{
	 int digit4 = number%10;
	 number = number/10;
	 int digit3 = number%10;
	 number = number/10;
	 int digit2 = number%10;
	 number = number/10;
	 int digit1 = number%10;
	 number = number/10;
		
	 switch (digit1)
		{
		case 1: System.out.print("One ");break;
		case 2: System.out.print("Two "); break;
		case 3: System.out.print("Three "); break;
		case 4: System.out.print("Four "); break;
		case 5: System.out.print("Five "); break;
		case 6: System.out.print("Six "); break;
		case 7: System.out.print("Seven "); break;
		case 8: System.out.print("Eight "); break;
		case 9: System.out.print("Nine "); break;
		case 0: System.out.print("Zero "); break;
		default: System.out.print(""); break;
		}
		switch (digit2)
		{
		case 1: System.out.print("One ");break;
		case 2: System.out.print("Two "); break;
		case 3: System.out.print("Three "); break;
		case 4: System.out.print("Four "); break;
		case 5: System.out.print("Five "); break;
		case 6: System.out.print("Six "); break;
		case 7: System.out.print("Seven "); break;
		case 8: System.out.print("Eight "); break;
		case 9: System.out.print("Nine "); break;
		case 0: System.out.print("Zero "); break;
		default: System.out.print(""); break;
		}
		switch (digit3)
		{
		case 1: System.out.print("One ");break;
		case 2: System.out.print("Two "); break;
		case 3: System.out.print("Three "); break;
		case 4: System.out.print("Four "); break;
		case 5: System.out.print("Five "); break;
		case 6: System.out.print("Six "); break;
		case 7: System.out.print("Seven "); break;
		case 8: System.out.print("Eight "); break;
		case 9: System.out.print("Nine "); break;
		case 0: System.out.print("Zero "); break;
		default: System.out.print(""); break;
		}
		switch (digit4)
		{
		case 1: System.out.print("One ");break;
		case 2: System.out.print("Two "); break;
		case 3: System.out.print("Three "); break;
		case 4: System.out.print("Four "); break;
		case 5: System.out.print("Five "); break;
		case 6: System.out.print("Six "); break;
		case 7: System.out.print("Seven "); break;
		case 8: System.out.print("Eight "); break;
		case 9: System.out.print("Nine "); break;
		case 0: System.out.print("Zero "); break;
		default: System.out.print(""); break;
		}
		
		return number;
		
	}
	public void expands(int num)
	{
		
	}
}
