
public class Average {

	public static void main(String[] args) {
	double [] arr= {2.0,2.0,2.0,2.0,2.0};
	double sum=0.0,average;;
	
    for (double num: arr) {
        sum =sum+num;
     }
    average = sum / arr.length;
    System.out.println("Average is");
     System.out.println(average);

	}

}
