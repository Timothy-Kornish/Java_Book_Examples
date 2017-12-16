import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

	public static void main(String[] args){
	
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a,b,c;
		String answer ="y";
	
		while(answer.equals("y")){
			a = rand.nextInt(10);
			b = rand.nextInt(10);
			c = rand.nextInt(10);
		
			System.out.println(a +"  "+b+"  "+c);
			
			System.out.println();
			if((a==b || b==c || a==c) && !(a==b && b==c)){
				System.out.println("Congradulations! 2 of the numbers are the same.");
			}
			if(a==b&& b==c && a==c){
				System.out.println("JACKPOT!!  All three numbers are the same!");
			}
			System.out.println("\nPlay again (y/n)?");
			answer = scan.nextLine();
			answer.toLowerCase();
		}
		
	}
}
