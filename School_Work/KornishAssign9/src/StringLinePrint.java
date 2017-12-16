import java.util.Scanner;
public class StringLinePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str ="";
		System.out.println("Please enter a sentece or word.");
		str= scan.nextLine();
		
		int strLength=str.length();
		for(int index=0; index<strLength;index++){
			System.out.println(str.charAt(index));
		}

	}

}
