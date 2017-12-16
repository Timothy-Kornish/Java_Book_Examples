import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Distance {

	public static void main(String[] args) {
		double x1,x2,y1,y2;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.######");
		
		System.out.println("Please enter the first coordinate in cartesian coordinates: ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		
		System.out.println("Please enter the second coordinate in cartesion coordinates: ");
		x2 = scan.nextDouble();
		y2= scan.nextDouble();
		
		double distance = Math.sqrt((Math.pow((x1-x2),2) + Math.pow((y1-y2),2) ));
		
		System.out.println("The distance between the two coordinates is: "+df.format(distance)+" units long");

	}

}
