import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a,b,c;
		
		System.out.println("please enter three seperate integers: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		double average = (a+b+c)/3.0;
		System.out.println("The Average of these three integers is: "+average);
		
		
	}

}
