
public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("Ford", "Mustang", 2012, false);
		Car car2 = new Car("Rolls Royce", "Franklin", 1934, true );
		Car car3 = new Car("Lamborghini", "Aventador", 2015, false);
		Car car4 = new Car("Toyota", "Corolla", 2002, false);
		
		System.out.println(car1.toString()+"\n"+car2.toString()+
				"\n"+ car3.toString()+"\n"+car4.toString());
		
		car1.setYear(2016);
		car2.setModel("Franklin Mint");
		car3.setMake("Ferrari");
		car3.setModel("458 Spider");
		car4.setYear(2001);
		
		System.out.println();
		System.out.println(car1.toString()+"\n "+car2.toString()+
				"\n "+ car3.toString()+"\n "+car4.toString());
		
		System.out.println();
		System.out.println(car1.toString()+"\t\t Antique? "+car1.isAntique());
		System.out.println(car2.toString()+"\t Antique? "+car2.isAntique());
		System.out.println(car3.toString()+"\t Antique? "+car3.isAntique());
		System.out.println(car4.toString()+"\t\t Antique? "+car4.isAntique());

	}

}
