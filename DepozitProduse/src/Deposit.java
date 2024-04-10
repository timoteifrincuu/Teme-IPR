import java.util.ArrayList;

public class Deposit {

	public static void main(String[] args) {

		ArrayList<Product> deposit = new ArrayList<Product>();
		deposit.add(new Product(0, "banane", 12.5, 10));
		deposit.add(new Product(1, "harbusti", 20, 90));
		deposit.add(new Product(2, "pere", 11, 50));
		deposit.add(new Product(3, "mere", 17.5, 70));
		System.out.println(deposit);
		
		deposit.add(new Product(0, "banane", 12.5, 13));
		System.out.println(deposit);
	}

}
