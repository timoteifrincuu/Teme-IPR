
public class AvioaneCalatori extends Avioane {
	int maxPassengers;
	
	public AvioaneCalatori(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}
}
