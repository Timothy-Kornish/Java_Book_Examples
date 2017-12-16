import java.util.Scanner;

import java.text.DecimalFormat;
public class SphereArea {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double radius, volume, surface_area;
		
		System.out.println("Please enter a radius of a sphere");
		radius = scan.nextDouble();
		volume = 4 * Math.PI *Math.pow(radius, 3) /3;
		surface_area = 4 * Math.PI * Math.pow(radius, 2);
		
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		System.out.println("The volume of the sphere is: "+fmt.format(volume)+" units cubed.");
		System.out.println("The surface of the sphere is: "+fmt.format(surface_area)+" units squared.");
	}
	
}