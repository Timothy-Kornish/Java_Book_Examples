import java.util.Scanner;

public class LoveCS {

	public static void main(String[] args) {
		int answer=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many times would you like to print the phrase \"I Love Computer Science\"");
		answer = scan.nextInt();
		int count =1;
		int sum=0;
		while (count<=answer){
			System.out.println(count+": I Love Computer Science!");
			sum+=count;
			count++;
			
		}
		
		System.out.println("You printed the phrase "+(count-1) +" times. The sum of 1 to "+(count-1) +" is "+sum);

	}

}
