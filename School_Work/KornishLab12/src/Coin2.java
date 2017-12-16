
public class Coin2 implements Lockable{

	private final int HEADS= 0;
	private final int TAILS=1;
	private int key;
	private boolean locked;
	
	
	private int face;
	
	public Coin2(){
		flip();
		key =0;
		locked = false;
	}
	public void flip(){
		if(!locked){
			face = (int) (Math.random()*2);
		}
	}
	public boolean isHeads(){
		return (face ==HEADS);
	}
	
	public void setKey(int newKey){
		if(!locked){
			key = newKey;
		}
	}
	public void lock(int newKey){
		if(key == newKey){
			locked = true;
		}
		
		
	}
	public void unlock(int newKey){
		if(key == newKey){
			locked = false;
		}
	}
	public boolean locked(){
		return locked;
	}
	
	public String toString(){
		
		if(!locked){
			String faceName;
			if(face ==HEADS){
				faceName ="Heads";
			}
			else{
				faceName = "Tails";
			}
			return faceName;
		}
		else{
			return "LOCKED";
		}
	}
}
