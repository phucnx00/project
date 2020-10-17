package ban_quan_ao;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private static List<Product> products = new ArrayList<>();

	public static  void add(Product product) {
		products.add(product);
	}
	
	public static void sell(List<Product> product) {
		products.removeAll(product);
	}

	public static List<Product> getProducts() {
		return products;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return Shop.products.toString();
//	}
}
