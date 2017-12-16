
public class Coin2Test {

	public static void main(String[] args) {
		Coin2 myCoin = new Coin2();
		myCoin.setKey(1111);
		
		System.out.println("Initial: "+myCoin);
		
		myCoin.lock(1111);
		System.out.println("After lock: "+myCoin);
		
		myCoin.flip();
		System.out.println("After attempted flip: "+myCoin);
		
		myCoin.unlock(1111);
		System.out.println("After unlock: "+myCoin);

	}

}
