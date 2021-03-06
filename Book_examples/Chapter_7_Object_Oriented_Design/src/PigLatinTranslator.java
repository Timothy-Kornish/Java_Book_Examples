import java.util.Scanner;

public class PigLatinTranslator {

	public static String translate(String sentence){
		String result ="";
		sentence = sentence.toLowerCase();
		Scanner scan = new Scanner(System.in);
		
		while (sentence.equals(sentence))
			{
			result += translateWord(scan.next());
			result +=" ";
			
			}
		return result;
	}
	
	public static String translateWord(String word){
		String result ="";
		if(beginsWithVowel(word)){
			result = word + "yay";
		}
		else{
			if(beginsWithBlend(word)){
				result = word.substring(2) + word.substring(0,2) +"yay";
			}
			else{
				result = word.substring(1) + word.charAt(0) + "ay";
			}
		}
		return result;
	}
	
	public static boolean beginsWithVowel(String word){
		String vowels ="aeiou";
		
		char letter = word.charAt(0);
		return (vowels.indexOf(letter) != -1);
	}
	public static boolean beginsWithBlend(String word){
		return (word.startsWith("bl") || word.startsWith("br") ||
				word.startsWith("ch") || word.startsWith("cl") ||
				word.startsWith("cr") || word.startsWith("dr") ||
				word.startsWith("dw") || word.startsWith("fl") ||
				word.startsWith("fr") || word.startsWith("gl") ||
				word.startsWith("gr") || word.startsWith("kl") ||
				word.startsWith("ph") || word.startsWith("pl") ||
				word.startsWith("pr") || word.startsWith("sc") ||
				word.startsWith("sh") || word.startsWith("sk") ||
				word.startsWith("sl") || word.startsWith("sn") ||
				word.startsWith("sm") || word.startsWith("sp") ||
				word.startsWith("sq") || word.startsWith("st") ||
				word.startsWith("sw") || word.startsWith("th") ||
				word.startsWith("tr") || word.startsWith("tw") || 
				word.startsWith("wh") || word.startsWith("wr"));
	}
	
}
