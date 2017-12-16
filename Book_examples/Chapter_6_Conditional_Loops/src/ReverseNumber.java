import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, lastDigit, reverse =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a posistive integer: ");
		number = scan.nextInt();
		number*=10;
		do
		{
			lastDigit = number%10;
			reverse = (reverse*10) + lastDigit;
			number =number/10;
			
		}
		while(number>10);
		
		System.out.println("That number reversed is: "+ reverse);
		

	}

}
