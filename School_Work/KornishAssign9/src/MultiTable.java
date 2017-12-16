
public class MultiTable {

	public static void main(String[] args) {
		int start =1;
		final int MAX=12;
		
		
		for(int row =start; row<= MAX; row++){
			for(int column = start; column<=MAX; column++){
				System.out.print(row*column +"\t");
			}
			System.out.println();
		}
		/*while (number<=MAX){
			System.out.println(number+" x "+number+" = "+(int)Math.pow(number,2));
			number++;
		}*/

	}

}
