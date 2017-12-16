
public class Books {
	
	private String title, author, publisher;
	private int copyright;
	
	public Books(String newTitle, String newAuthor, String newPub, int newCopy ){
	title = newTitle;
	author = newAuthor;
	publisher = newPub;
	copyright = newCopy;
	}
	// Setters
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public void setAuthor(String newAuthor){
		author = newAuthor;
	}
	public void setPublisher(String newPub){
		publisher = newPub;
	}
	public void setCopyrightDate(int newCopy){
		copyright = newCopy;
	}
	
	// Getters
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String getPublisher(){
		return publisher;
	}
	public int getCopyrightDate(){
		return copyright;
	}
	public String toString(){
		String result ="";
		result ="Title: \t\t\t"+title +"\nAuthor: \t\t"+author+"\nPublisher: \t\t"+ publisher;
		result += "\nCopyright Date: \t"+copyright+"\n";
		return result;
	}
	
	
	
}
