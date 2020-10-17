package ban_quan_ao;

import java.util.List;

public class User {
	private String name;

	public User(String name) {

		this.name = name;
	}

	public List<Product> view() {
		return Shop.getProducts();
	}

	public Customer register(String name, String username, String password, Email email, String address, String phone,
			Card card) {
		return new Customer(name, username, password, email, address, phone, card);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
