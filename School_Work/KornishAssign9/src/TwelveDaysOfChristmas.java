import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class TwelveDaysOfChristmas {

	public static void main(String[] args) {

		int index=0;
		final int MAX=12;
		String on ="On the ", day = " day of Christmas my true love gave to me\n";
		ArrayList<String> days = new ArrayList<String>();
		days = new ArrayList<String>(Arrays.asList("A partridge in a pear tree.",
				"Two turle doves, and",
				"Three French hens,",
				"Four calling birds,",
				"Five golden rings,",
				"Six geese a-laying,",
				"Seven swans a-swimming,",
				"Eight maids a-milking,",
				"Nine ladies dancing,",
				"Ten lords a-leaping,",
				"Eleven pipers piping,",
				"Twelve drummers drumming"));

		for(int count =0; count<=MAX; count++){

			switch(count){
			case 1:
				System.out.println(on+count+"st"+day+days.get(count-1));
				System.out.println();
				break;
			case 2:
				System.out.println(on+count+"nd"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println();
				break;
			case 3:
				System.out.println(on+count+"rd"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3));
				System.out.println();
				break;
			case 4:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4));
				System.out.println();
				break;
			case 5:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println();
				break;
			case 6:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6));
				System.out.println();
				break;
			case 7:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6)+"\n"+days.get(count-7));
				System.out.println();
				break;
			case 8:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6)+"\n"+days.get(count-7)+"\n"+days.get(count-8));
				System.out.println();
				break;
			case 9:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6)+"\n"+days.get(count-7)+"\n"+days.get(count-8));
				System.out.println(days.get(count-9));
				System.out.println();
				break;
			case 10:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6)+"\n"+days.get(count-7)+"\n"+days.get(count-8));
				System.out.println(days.get(count-9)+"\n"+days.get(count-10));
				System.out.println();
				break;
			case 11:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6)+"\n"+days.get(count-7)+"\n"+days.get(count-8));
				System.out.println(days.get(count-9)+"\n"+days.get(count-10)+"\n"+days.get(count-11));
				System.out.println();
				break;
			case 12:
				System.out.println(on+count+"th"+day+days.get(count-1)+"\n"+days.get(count-2));
				System.out.println(days.get(count-3)+"\n"+days.get(count-4) +"\n"+days.get(count-5));
				System.out.println(days.get(count-6)+"\n"+days.get(count-7)+"\n"+days.get(count-8));
				System.out.println(days.get(count-9)+"\n"+days.get(count-10)+"\n"+days.get(count-11));
				System.out.println(days.get(count-12));
				break;
			}
		}
	}
}
