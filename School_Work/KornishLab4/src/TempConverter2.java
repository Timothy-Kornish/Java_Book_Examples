import java.util.Scanner;
public class TempConverter2 {

	public static void main(String[] args) {
		final double CONVERTER = 1.8;
		final double ADD = 32;
		Scanner scan = new Scanner(System.in);
		double temp, celcius;
		System.out.println("Please enter the temperature in Fahrenheit: ");
		temp = scan.nextDouble();
		celcius = (temp -ADD) /CONVERTER;
		System.out.println("The temperature in Celcius is: "+celcius);
		
		
				

	}

}
