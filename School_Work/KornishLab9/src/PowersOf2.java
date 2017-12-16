import java.util.Scanner;
public class PowersOf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int answer=0;
		System.out.println("How many powers of 2 would you like to see?");
		answer=scan.nextInt();
		int pow=1;
		
		
		System.out.println("The first "+answer+" power of 2 are:");
			for (int count =0; count <answer; count++){
				
				System.out.println("2^"+count+" = "+pow);
				pow*=2;
			}
		
		
	}

}
