import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class BookShelf {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(new File("./src/Books.txt"));
		ArrayList<Books> books = new ArrayList<Books>();
		
		String author, title, publisher;
		int copyright;
		int count =0;
		
		while(scan.hasNext()){
			title = scan.nextLine();
			author = scan.nextLine();
			publisher = scan.nextLine();
			copyright = Integer.parseInt(scan.nextLine());
			
			Books book = new Books(title,author,publisher,copyright);
			books.add(book);
			
		}
		
		
		while (count <books.size() ){
			System.out.println(books.get(count));
			count++;
		}
	}
}
