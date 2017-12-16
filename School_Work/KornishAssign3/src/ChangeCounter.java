import java.util.Scanner;

public class ChangeCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double quarter,dime,nickel,penny;
		
		System.out.println("Please enter the number of quarters in the jar:");
		quarter = scan.nextDouble();
		System.out.println("Please enter the number of dimes in the jar:");
		dime = scan.nextDouble();
		System.out.println("Please enter the number of nickels in the jar:");
		nickel = scan.nextDouble();
		System.out.println("Please enter the number of pennies in the jar:");
		penny = scan.nextDouble();
		
		double q,d,n,p, total;
		q = quarter/4;
		d = dime/10;
		n = nickel/20;
		p = penny/100;
		total = q+n+d+p;
		int dollars, change;
		dollars = (int) total/1;
		change= (int) (100 * total) % 100;
			
		if (dollars == 1){
			if(change==1){
			System.out.println("You have " + dollars+" dollar and "+ change+" cent in the jar");
			}
			else{
				System.out.println("You have " + dollars+" dollar and "+ change+" cents in the jar");

			}
			
		
		}
		else{
			if(change==1){
				System.out.println("You have " + dollars+" dollars and "+ change+" cent in the jar");
				}
				else{
					System.out.println("You have " + dollars+" dollars and "+ change+" cents in the jar");

				}

		}
		
	}

}
