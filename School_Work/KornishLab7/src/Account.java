
public class Account {

	private double balance;
	private String name;
	private long acctNum;
	private int fee=10;
	
	public Account(double initial_bal, String owner, long number){
		balance=initial_bal;
		name = owner;
		acctNum=number;
	}
	public void withdraw(double amount){
		if(balance >= amount){
			balance-=amount;
		}
		else{
			System.out.println("Insufficient funds");
		}
	}
	public void deposit(double amount){
		balance+=amount;
	}
	public double getBalance(){
		return balance;
	}
	public String toString(){
		return name +"\t Account Number: " +acctNum + "\t Balance: $"+ balance;
	}
	public void chargeFee(){
		balance-=fee;
	}
	public void changeName(String newName){
		name = newName;
	}
	
	
}
