
public class Advice extends Thought{
	public void message(){
		System.out.println("Warning: Dates in calender are closer than they appear.");
		
		System.out.println();
		super.message();
	}
}
