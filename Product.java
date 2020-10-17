package ban_quan_ao;

public abstract class Product {
	private String id;
	private double price;
	private String name;

	public Product(String id, double price, String name) {

		this.id = id;
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}




	
	

}
