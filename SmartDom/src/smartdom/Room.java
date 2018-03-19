package smartdom;

public class Room {
	private static int roomIdCounter;
	private int roomId;
	private String roomName;
	private boolean isWindow;
	private boolean isSensor;
	Sensor sensor;
	Window[] windows;
	
	public Room() {}
	public Room(String roomName, int numberOfWindow) {
		roomIdCounter++;
		this.roomId = roomIdCounter;
		this.roomName = roomName;
		if (numberOfWindow > 0) {
			isWindow = true;
			isSensor = true;
			sensor = new Sensor();
			windows = new Window[numberOfWindow];
			for (int i=0; i<numberOfWindow; i++) {
				windows[i] = new Window();
			}
		}
		System.out.println("Room " + this.roomName + " ID: " + this.roomId + " has been created");
	}
	
	public int howManyWindow() {
		if (!this.isWindow) {
			System.out.println("There is no rooms in " + this.roomName + " Id: " + this.roomId);
			return 0;
		} else {
			System.out.println("There are " + this.windows.length + " windows in " +  this.roomName + " Id: " + this.roomId);
			return this.windows.length;
		}
	}
	
	public boolean isSensorInside() {
		return isSensor;
	}
	
	public boolean isWindowInside() {
		return isWindow;
	}
	
	public boolean checkRoomAlarm() {
		if (isWindow) {
			for (int i=0; i<windows.length; i++) {
				if (this.windows[i].getWindowState() && this.sensor.getSensorState()) {
					System.out.println("Alarm in ON in room: " + this.roomName + ", Id: " + this.roomId);
					return true;
				}
			}
		}
		return false;
	}
	
}
		
//	Created two windows and two sensors for tests
//		Window window = new Window();
//		Window window2 = new Window();
//		
//		System.out.println(window.getWindowId() + " = " + window.getWindowState());
//		System.out.println(window2.getWindowId() + " = " + window2.getWindowState());
//		
//		window2.setWindowState(true);
//		System.out.println(window2.getWindowState());
//		
//		Sensor sensor1 = new Sensor();
//		Sensor sensor2 = new Sensor();
//		
//		System.out.println(sensor1.getSensorId() + " = " + sensor1.getSensorState());
//		System.out.println(sensor2.getSensorId() + " = " + sensor2.getSensorState());
//		
//		sensor1.setSensorState(true);
//		System.out.println(sensor1.getSensorId() + " = " + sensor1.getSensorState());
//		System.out.println(sensor2.getSensorId() + " = " + sensor2.getSensorState());
//	}
