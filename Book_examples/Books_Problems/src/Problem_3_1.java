import java.util.Scanner;
import java.util.Random;

public class Problem_3_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random num = new Random();
		
		String first ="", last ="";
		
		int n=90; // number range
		
		System.out.println("Please enter your first name ");
		first = scan.nextLine();
		System.out.println("Please enter your last name: ");
		last = scan.nextLine();
		
		int x = num.nextInt(n) +10;
		
		if (last.length()>=5){
			System.out.println("Your password is: " + first.substring(0,1) + x + last.substring(0,5));
		}
		else{
			System.out.println("Your password is: " + first.substring(0,1) + x + last) ;
		}
		
	}

}
