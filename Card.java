package ban_quan_ao;

public class Card {
	private double balance;
	private String id;
	
	public Card(double balance, String id) {
		
		this.balance = balance;
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deduct(double amount) {
		balance -= amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
