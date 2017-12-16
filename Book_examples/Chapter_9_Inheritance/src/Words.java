
public class Words {

	public static void main(String[] args) {
		
		Dictionary webster = new Dictionary();
		
		System.out.println("Number of pages: "+webster.getPages());
		
		System.out.println("Number of definitions: "+ webster.getDefinitions());
		
		System.out.println("Definitions per page: "+ webster.computeRatio());
		webster.setPages(2000);
		
		System.out.println("Now there are "+webster.getPages() +" in the dictionary.");
		System.out.println("Definitions per page: "+ webster.computeRatio());
		

	}

}
