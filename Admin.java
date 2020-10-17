package ban_quan_ao;

public class Admin {
	private static int maGiaoDich;

	public static void send(Customer customer) {

		customer.getEmail().setMessage(("Ma giao dich: " + maGiaoDich + "\n"+"Nguoi mua: " + customer.toString() +"\n"+  "san pham: "
				+ customer.getProducts().toString() +"\n "+"Tong tien: "+ (customer.getTotalPrice() - Ao.getDiscount(customer)
				- Quan.getDiscount(customer))));
	}

	public static void check(Customer customer) {
		if (customer.getCard().getBalance() > customer.getTotalPrice() - Ao.getDiscount(customer)
				- Quan.getDiscount(customer)) {
			customer.getCard().deduct(customer.getTotalPrice() - Ao.getDiscount(customer) - Quan.getDiscount(customer));
			Shop.sell(customer.getProducts());
			System.out.println("Giao dich thanh cong. Quy khach vui long kiem tra email");
			maGiaoDich++;
			CustomerHistory.addHistory(customer);
			Admin.send(customer);
		} else
			System.out.println("tai khoan quy khach k du");
	}
}
