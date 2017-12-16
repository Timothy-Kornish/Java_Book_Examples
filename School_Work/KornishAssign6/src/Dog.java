
public class Dog {

	private int age;
	private String name;
	
	public Dog(String petName, int petAge){
		name =petName;
		age=petAge;
	}
	
	public int setNewAge(){
		return age+=1;
	}
	public int setAge(){
		
		return age*7;
	}
	public int getAge(){
		return age;
	}
	public String setName(String newName){
		name =newName;
		return name;
	}
	public String getName(){
		
		return name;
	}
	public String toString(){
		return "Dog: "+name +"\tAge: "+ age;
	}

}
