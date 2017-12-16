
public class Primes {

	public static void main(String[] args) {
		int[] primeNums ={2,3,5,7,11,13,17,19};
		
		System.out.println("Array length: "+primeNums.length);
		
		System.out.println("The first few primes numbers are:");
		
		for(int prime:primeNums){
			System.out.print(prime+" ");
		}

	}

}
