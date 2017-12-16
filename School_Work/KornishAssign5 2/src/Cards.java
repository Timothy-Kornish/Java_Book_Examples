
public class Cards {

	enum Rank {ace, two,three,four,five,six,seven,eight,nine,ten,jack,queen,king}
	
	public static void main(String[] args) {
		
		Rank highCard, faceCard, card2,card1;
		
		highCard = Rank.ace;
		faceCard = Rank.jack;
		card1 = Rank.eight;
		card2 = Rank.eight;
		
		System.out.println("A Blackjack hand is: "+ highCard + " and "+ faceCard );
		
		int card1_Val, card2_Val;
		
		card1_Val = card1.ordinal()+1;
		card2_Val = card2.ordinal()+1;
		
		System.out.println("A two card hand: "+card1 +" and "+ card2);
		System.out.println("Hand value: "+ (card1_Val+card2_Val));
	}

}
