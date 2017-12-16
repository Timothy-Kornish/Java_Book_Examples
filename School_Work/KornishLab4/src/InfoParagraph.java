import java.util.Scanner;
public class InfoParagraph {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, college, pet;
		short age;
		System.out.println("Please enter your name, age, college, and pet's name: ");
		name = scan.next();
		age = scan.nextShort();
		college = scan.next();
		pet = scan.next();
		
		System.out.println("Hello, my name is "+name+", and I am "+age+" years old.");
		System.out.println("I'm enjoying my time at "+college+", though I miss");
		System.out.println("my pet "+pet+" very much!");
		
		

	}

}
