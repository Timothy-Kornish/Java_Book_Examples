import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String sentence, result, another;
		
		do{
			System.out.println();
			System.out.println("Enter a sentence (no punctuation): ");
			sentence = scan.nextLine();
			
			System.out.println();
			
			System.out.println("The sentence in pig Latin is: ");
			result = PigLatinTranslator.translate(sentence);
			System.out.println(result);
			
			System.out.println();
			System.out.println("Translate another sentence (y/n)? ");
			another = scan.nextLine();
		}
		while (another.equalsIgnoreCase("y"));
	}
}
