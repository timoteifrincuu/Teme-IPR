
public class Compensated extends Product {

	private double coeficient;
	
	public Compensated(int code, String name, double basePrice, int quantity) {
		super(code, name, basePrice, quantity);
		
	}

	public double getCoeficient() {
		return basePrice * coeficient;
	}

	
}
