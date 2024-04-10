
public class Avioane {
	private String planeID;
	private int totalEnginePower;

	public String getPlaneID() {
		return planeID;
	}
	
	public Avioane(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}

	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	public void takeOff() {
		System.out.println(planeID+"-Initiating takeoff procedure-Starting engines-Accelerating down the runnway-Taking off-Retracting gear-Takeoff complete");
	}
	
	public void land() {
		System.out.println(planeID+"-Initiating landing procedure-Enabling airbrakes-Lowering gear-Contacting runway-Decelerating-Stopping engines-Landing complete");
	}
	
	public void fly() {
		System.out.println(planeID+"-Flying");
	}
			
}
