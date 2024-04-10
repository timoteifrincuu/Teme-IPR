
public class Product {

	private int code;
	private String name;
	protected double basePrice;
	private int quantity;
	
	public Product(int code, String name, double basePrice, int quantity) {

		this.code = code;
		this.name = name;
		this.basePrice = basePrice;
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return code + " " + name + " " + basePrice + " " + quantity ;
	}
}
