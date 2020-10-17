package ban_quan_ao;

public class Test {

	public static void run() {
		User user = new User("Phuc");
		Customer customer = user.register("Nguyen Xuan Phuc", "heartbreaker", "123456", new Email("phucnx00@gmail.com"), "123", "456789", new Card(10_000_000, "123456"));
		Customer customer2 = new Customer("Yena", "thewitcher", "123456", new Email("213@gmail.com"), "1234", "123456789", new Card(1_000_000, "123"));
		Product ao1 = new Ao("1", 100__000, "Ao mua he");
		Product ao2 = new Ao("2", 200_000, "Ao so mi");
		Product ao3 = new Ao("3", 500_000, "Ao mua dong");
		Product quan1 = new Ao("1", 500_000, "Quan bo");
		Product quan2= new Ao("2", 100_000, "Quan vai");
		Product quan3 = new Ao("3", 200_000, "Quan kaki");
		Product quan4 = new Ao("4", 150_000, "Quan short");
		
		Shop.add(ao1);
		Shop.add(ao2);
		Shop.add(ao3);
		Shop.add(quan1);
		Shop.add(quan2);
		Shop.add(quan3);
		Shop.add(quan4);
		
		customer.buy(ao1);
		customer.buy(ao3);
		customer.buy(quan2);
		
		customer2.buy(ao2);
		customer2.buy(quan4);
		customer2.buy(quan1);
		System.out.println(Shop.getProducts().toString());
		Admin.check(customer);
		Admin.check(customer2);
		
		System.out.println(CustomerHistory.getHistory());
		System.out.println(customer.getEmail().getMessage());
		System.out.println(customer2.getEmail().getMessage());
		System.out.println(Shop.getProducts().toString());
	}

}
