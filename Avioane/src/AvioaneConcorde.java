
public class AvioaneConcorde extends AvioaneCalatori {
	
	public AvioaneConcorde(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);
	}
	
	public void goSuperSonic() {
		System.out.println(planeID+"-Supersonic mode activated");
	}
	
	public void goSubSonic() {
		System.out.println(planeID+"-Supersonic mode deactivated");
	}
}
