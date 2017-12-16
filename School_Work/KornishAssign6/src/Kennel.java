
public class Kennel {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Spot", 7);
		Dog dog2 = new Dog("Rusty",9);
		Dog dog3 = new Dog("Rex", 5);
		
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		
		dog1.setNewAge();
		System.out.println();
		
		System.out.println("Happy birthday, old "+dog1.getName()+". You just turned "+dog1.getAge());
		System.out.println("You are now " + dog1.setAge() + " years old in dog-years");
	}
}
