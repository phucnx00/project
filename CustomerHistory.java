package ban_quan_ao;

import java.util.ArrayList;
import java.util.HashMap;


public class CustomerHistory {
	

	private  static HashMap<String, ArrayList<Product>> history = new HashMap<>();
	
	public static void addHistory(Customer customer) {
		history.put(customer.toString(), (ArrayList<Product>) customer.getProducts());
	}
	
	public static HashMap<String, ArrayList<Product>> getHistory() {
		return history;
	}

	
	
}
	
