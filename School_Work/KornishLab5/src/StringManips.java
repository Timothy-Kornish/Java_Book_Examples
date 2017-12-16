import java.util.Scanner;
public class StringManips {

	public static void main(String[] args) {
		
		String phrase = new String("This is a String test.");
		int phraseLength, middleIndex;
		String firstHalf;
		String secondHalf;
		String switchedPhrase;
		Scanner scan = new Scanner(System.in);
		phraseLength = phrase.length();
		middleIndex = phraseLength/2;
		
		firstHalf = phrase.substring(0, middleIndex);
		secondHalf = phrase.substring(middleIndex,phraseLength);
		
		switchedPhrase = secondHalf.concat(firstHalf);
		
		String middle3 = phrase.substring(middleIndex-1, middleIndex+2);
		
		switchedPhrase = switchedPhrase.replace(' ', '*');
		
		String city, state;
		
		System.out.println("Please enter your hometown: ");
		city = scan.nextLine();
		System.out.println("Please enter your home state: ");
		state = scan.nextLine();
		
		
		System.out.println();
		System.out.println("Original phrase: "+phrase);
		System.out.println("Length of the phrase: "+ phraseLength+" characters");
		System.out.println("Index of the middle: "+ middleIndex);
		System.out.println("Character at the middle index: "+phrase.charAt(middleIndex));
		System.out.println("Switched phrase: "+switchedPhrase);
		System.out.println("Middle three characters are: "+ middle3);
		System.out.println();
		System.out.println("You live in: "+state.toUpperCase() +", "+city.toLowerCase() + ", "+ state.toUpperCase() );
	}

}
