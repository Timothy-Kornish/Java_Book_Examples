
public class Circle {

	public static void main(String[] args) {
		final double Pi = 3.14159;
		int radius1 =10;
		int radius2 =20;
		double circumfrence1 = 2*Pi * radius1;
		double circumfrence2 = 2*Pi*radius2;
		double area1 = Pi *radius1*radius1;
		double area2 = Pi* radius2*radius2;
		double factor_a = area2/area1;
		double factor_c = circumfrence2/circumfrence1;
		
		System.out.println("The area of a circle with radius " + radius1 + " ft. is " + area1+" ft. squared" );
		System.out.println("The circumfrence of a circle with radius "+radius1+" ft. is " +circumfrence1+ " ft" );
		System.out.println();
		System.out.println("The area of a circle with radius " + radius2 + " ft. is " + area2+ " ft. squared");
		System.out.println("The circumfrence of a circle with radius "+radius2+" ft. is " +circumfrence2 + " ft.");
		System.out.println();
		System.out.println("By doubling the radius of "+radius1+" to "+radius2+ " the circumfrence grew by a factor of "+ factor_c);
		System.out.println("By doubling the radius of "+radius1+" to "+radius2+ " the area grew by a factor of "+ factor_a);

	}

}
