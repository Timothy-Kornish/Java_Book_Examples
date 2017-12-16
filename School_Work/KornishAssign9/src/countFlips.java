
public class countFlips {

	public static void main(String[] args) {
		int countHeads=0, countTails=0;
		int flips=100;
		Coin myCoin = new Coin();
		
		for(int index=0; index<flips; index++){
			myCoin.flip();
			if(myCoin.isHeads()){
				countHeads++;
			}
			if(myCoin.isTails()){
				countTails++;
			}
		}
		System.out.println("Number of heads: "+countHeads);
		System.out.println("Number of tails: "+countTails);

	}

}
