
public class AvioaneTomCat extends AvioaneDeLupta {
	
	public AvioaneTomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void refuel() {
		System.out.println(planeID+"-Initiating refuel procedure-Locating refuller-Catching up-Refueling-Refueling complete");
	}
}
