package ban_quan_ao;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	private String username;
	private String password;
	private Email email;
	private String address;
	private String phone;
	private Card card;
	private int numberAo;
	private int numberQuan;
	private double totalPrice;
	private List<Product> products = new ArrayList<Product>();

	public Customer(String name, String username, String password, Email email, String address, String phone,
			Card card) {
		super(name);
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.card = card;
	}

	public void buy(Product product) {
		this.totalPrice += product.getPrice();
		if (product instanceof Ao) {
			numberAo++;
			this.getProducts().add(product);
		} else {

			numberQuan++;
			this.getProducts().add(product);
		}

	}
	
	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Card getCard() {
		return card;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public int getNumberQuan() {
		return numberQuan;
	}

	public int getNumberAo() {
		return numberAo;
	}

	public List<Product> getProducts() {
		return products;
	}

	

}
