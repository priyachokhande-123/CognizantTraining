import java.util.Scanner;

public class Validation {
	
	public static void main(String[] args) {
	 String name;
	 int age;
	 String ch;

     String reg1 = "^[a-zA-Z ]+";
	 String  reg2 = "\\d[0123456789]";
	    
	 Scanner sc=new Scanner(System.in);
	
	 
     do {
    	  System.out.println("Enter your name");
    	  name=sc.next();
         if (name.matches(reg1))
              System.out.println("Welcome"+" "+name);
          else if (name.isEmpty())
              System.out.println("String field should not be Empty.");
          else if(!name.matches(reg1))
          System.out.println("Please Enter A Valid String!");
      } while(!name.matches(reg1));
      
      System.out.println("My name is:"+name);
	}
}
