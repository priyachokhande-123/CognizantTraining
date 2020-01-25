import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number which you wants to make the table");
    int number=sc.nextInt();
    for(int i=1;i<=10;i++){
   int mul=number*i;
    System.out.println(mul);
    }
	}

}
