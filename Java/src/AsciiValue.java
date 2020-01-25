import java.util.Scanner;

public class AsciiValue {
	    public static void main(String[] args) {
	    
	    	int i=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a character");
	    char ch=sc.next().charAt(0);
	   
	        int ascii = ch;
	      
	        System.out.println("The ASCII value of " + ch + " is: " + ascii);
	       
	    }
	}

