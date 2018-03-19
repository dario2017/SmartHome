package smartdom;

public class Sensor {
	private static int sensorIdCounter;
	private int sensorId;
	private boolean sensorState;
	
	public Sensor() {
		sensorIdCounter++;
		this.sensorId = sensorIdCounter;
		System.out.println("Sensor " + this.sensorId + " has been created");
	}
	
	public void setSensorState(boolean bool) {
		this.sensorState = bool;
		if (bool == true) {
			System.out.println("Sensor " + this.sensorId + " is ON");
		} else {
			System.out.println("Sensor " + this.sensorId + " is OFF");
		}
	}
	
	public boolean getSensorState() {
		if (sensorState) {
			System.out.println("Sensor " + this.sensorId + " is ON");
		} else {
			System.out.println("Sensor " + this.sensorId + " is OFF");
		}
		return this.sensorState;
	}
	
	public int getSensorId() {
		return this.sensorId;
	}
}
