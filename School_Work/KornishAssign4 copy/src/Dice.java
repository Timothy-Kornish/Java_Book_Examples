import java.util.Random;
import java.lang.Math;
public class Dice {

	public static void main(String[] args) {
		Random rand = new Random();
		int die1 = rand.nextInt(6) +1;
		int die2 = rand.nextInt(6) +1;
		die2 = Math.abs(die2);
		die1= Math.abs(die1);
		System.out.println("Die 1 is: "+die1);
		System.out.println("Die 2 is: "+die2);
		System.out.println("The total is: "+ (die1+die2));
		
	
	}

}
