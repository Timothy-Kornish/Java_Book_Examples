import java.util.Scanner;

public class SumFrom2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int start =2;
		
		int input =0, sum=0;
		
		System.out.println("Enter a number you want the sum of all even numbers \nleading up to said number (odd number not inclusive):");
		System.out.println("Number must be larger than 2.");
		input =scan.nextInt();
		if(input<2){
			System.out.println("Please enter a number larger than 2");
		}
		while(start <=input){
			sum+=start;
			start+=2;
		
		}
		if(input%2==1){
			sum+=0;
		}
		System.out.println("The sum is: "+sum);
	}

}
