
public class Slogan {

	private String phrase;
	private static int count;
	
	public Slogan(String str)
	{
		phrase = str;
		count++;
	}
	
	public String toString()
	{
		return phrase;
	}
	
	public static int getCount()
	{
		return count;
	}
	
}
