import java.util.Scanner;
public class BottlesOfBeer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int verses, beers=100, index=1;
		
		String wall=" bottles of beer on the wall", bottles=" bottles of beer";
		String take ="If one of those bottles should happen to fall";
		
		System.out.println("How many verses of \"One hundred bottles of beer\" do you want printed?");
		verses = scan.nextInt();
		
		while(index<=verses && beers>0)
		{
			System.out.println(beers+wall+"\n"+beers+bottles+"\n"+take);
			beers--;
			System.out.println(beers+wall);
			index++;
			System.out.println();
			
		}
		if(beers<=0){
			System.out.println("You've run out of beer!");
		}
		

	}

}
