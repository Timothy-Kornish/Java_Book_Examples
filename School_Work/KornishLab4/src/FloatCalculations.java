import java.util.Scanner;

public class FloatCalculations {

	public static void main(String[] args) {
		float num_1, num_2; // numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		num_1 = scan.nextFloat();
		num_2 = scan.nextFloat();
		
		float difference;
		
		float sum = num_1 + num_2;
		float product = num_1 * num_2;
		
		System.out.println("The sum of the first two numbers is: " + sum);
		if (num_1 >= num_2){
			difference = num_1 - num_2;
			System.out.println("The difference between the two numbers is: " + difference);
		}
		else{
			difference = num_2 - num_1;
			System.out.println("The difference between the two numbers is: " + difference);
		
		}
		System.out.println("The product of the two numbers is: "+product);
	}

}
