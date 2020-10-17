package ban_quan_ao;

public class Ao extends Product {

	public Ao(String id, double price, String name) {
		super(id, price, name);
		// TODO Auto-generated constructor stub
	}


	public static double getDiscount(Customer customer) {
		// TODO Auto-generated method stub
		if (customer.getNumberAo() > 1) {
			return customer.getTotalPrice() * 0.05;
		} else if (customer.getNumberAo() > 2)
			return customer.getTotalPrice() * 0.1;
		else
			return 0;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ten san pham: " + super.getName() + ". " + "Gia: " + super.getPrice();
	}

	
	}


