
public class AvioaneMig extends AvioaneDeLupta {

	public AvioaneMig(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void highSpeedGeometry() {
		System.out.println(planeID+"-High speed geometry selected");
	}

	public void normaGeometry() {
		System.out.println(planeID+"-Normal geometry selected");
	}
}
