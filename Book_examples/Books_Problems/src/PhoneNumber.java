import java.util.Random;

public class PhoneNumber {

	public static void main(String[] args) {
		
		int first, second, third;
		Random rand = new Random();
		first = rand.nextInt(8);
		second = rand.nextInt(8);
		third = rand.nextInt(8);
		
		
		
		System.out.println("Your new phone number is: "+first+second+third);

	}

}
