import java.util.Scanner;
public class Factorials {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What number \"n\" would you like the factorial of (n cannot be 0 or negative)?");
		
		int answer = scan.nextInt();
		while (answer<0){
			System.out.println("Please enter a new number greater than 0.");
			answer = scan.nextInt();
		}
		
		int count=1, factorial =1;
		while(count<=answer){
			factorial *=count;
			count++;
			
		}
		System.out.println("The factorial of "+answer+" ("+answer+"!) = "+factorial);
	}

}
