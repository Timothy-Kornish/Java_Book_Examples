import java.text.DecimalFormat;

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class Deli {

	public static void main(String[] args) {
		
		final Double OUNCE_PER_POUND =16.0;
		double price_pound;
		double weight_ounces;
		double weight;
		double total_price;
		
		DecimalFormat fmt = new DecimalFormat("#.##");
		NumberFormat money =  NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the CS Deli! ! \n");
		System.out.println("Enter the price per pound of your item: ");
		
		price_pound = scan.nextDouble();
		
		System.out.println("Enter the weight in ounces: ");
		weight_ounces = scan.nextDouble();
		
		weight= weight_ounces/OUNCE_PER_POUND;
		total_price = price_pound * weight;
		
		System.out.println("*****CSDeli*****");
		System.out.println("Unit Price: \t"+money.format(price_pound) + " per pound");
		System.out.println("Weight:  \t "+fmt.format(weight) +" pounds");
		System.out.println("TOTAL:  \t"+money.format(total_price));
		
		
		
		
	}

}
