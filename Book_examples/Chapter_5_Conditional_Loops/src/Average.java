import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		double sum =0, value,count=0;
		double average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer (0 to quit): ");
		value = scan.nextDouble();
		
		while (value !=0){
			count++;
			sum+= value;
			System.out.println("The sum so far is: "+ sum);
			
			System.out.println("Enter an integer (0 to quit): ");
			value = scan.nextDouble();
		}
		System.out.println();
		
		if (count ==0){
			System.out.println("No values were entered.");
		}
		else{
			average = sum/count;
			
			DecimalFormat fmt = new DecimalFormat("0.###");
			System.out.println("The Average is "+fmt.format(average));
			
		}
		

	}

}
