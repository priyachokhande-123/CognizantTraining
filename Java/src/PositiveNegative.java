import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
 double number;
 System.out.println("Enter a number");
 number=sc.nextDouble();
 if(number>0.0)
 {
	 System.out.println("Number is Positive");
 }
 else if(number<0.0)
 {
	 System.out.println("Number is Negative");
 }
 else
 {
	 System.out.println("Number is equal to zero");
 }
	}

}
