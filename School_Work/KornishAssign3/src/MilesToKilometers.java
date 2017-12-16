import java.util.Scanner;
import java.text.*;
public class MilesToKilometers {

	public static void main(String[] args) {
		
		DecimalFormat df = new  DecimalFormat("#.#####");
		Scanner scan = new Scanner(System.in);
		double miles,kilos;
		final double conversion = 1.60935;
		System.out.println("Enter the number of miles you want to travel: ");
		miles = scan.nextDouble();
		kilos = miles * conversion;
		System.out.println("You are traveling " + df.format(kilos)+ " kilometers");
	}

}
