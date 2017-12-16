import java.lang.Math;
import java.util.Scanner;
public class Hypotenous {
	public static void main(String[] args){
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter two sides of a triangle (not hypotenous): ");
	
	double side1,side2, hyp;
	side1= scan.nextDouble();
	side2=scan.nextDouble();
	hyp= Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
	System.out.println("Hypotenous is: "+ hyp);
	
}
}
