import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int number = rand.nextInt(10)+1;
		int answer;
		int countHigh=0, countLow =0, countTotal=0;
		
		System.out.println("Guess a number between 1 and 10.");
		answer = scan.nextInt();
		
		
		while(answer!=number){
			if(answer<number){
				System.out.println("That guess is too low.");
				countLow++;
			}
			if(answer>number){
				System.out.println("That guess is too high.");
				countHigh++;
			}
			
			System.out.println();
			System.out.println("Please guess again.");
			answer =scan.nextInt();
			countTotal++;
		}
		System.out.println("Congradulations! you guessed the right number!");
		System.out.println();
		System.out.println("You guessed too high: "+countHigh+" times.");
		System.out.println("You guessed too low: "+countLow+" times.");
		System.out.println("You guessed a total of "+countTotal+" times.");
	}

}
