package smartdom;

public class Home {
	static Room[] rooms;
//	Floor floor;
	Floor floor1;
	Floor floor2;
	Window[] windows;
	
	public static void main(String[] args) {		
		Garage garage = new Garage();
		Attic attic = new Attic();
		
		Home home = new Home();
		
		home.startProgram();
		
		
//		System.out.println(floor1.rooms[1].howManyWindow());
//		System.out.println(floor1.rooms[1].windows[1].getWindowState());
//		
//		changeWindowState(true, floor2, 2, 1);
//		
//		System.out.println(floor2.rooms[2].windows[1].getWindowState());
		
//		System.out.println(floor1.rooms[2].windows[0].getWindowId());
		
//		System.out.println(floor1.rooms[1].sensor.getSensorState());
//		floor1.rooms[1].sensor.setSensorState(true);
//		changeSensorState(true, floor1, 2);
//		System.out.println(floor1.rooms[1].sensor.getSensorState());
//		checkAlarm(floor1);
//		changeWindowState(true, floor1, 1, 1);
//		changeSensorState(true, floor1, 1);
//		checkAlarm(floor1);
//		checkAlarm(floor2);
		
	}
	
	public void startProgram() {
		Floor floor1 = new Floor();
		Floor floor2 = new Floor();
		
		floor1.createFirstFloorRooms();
		floor2.createSecondFloorRooms();
		changeWindowState(true, floor1, 1, 1);
		checkAlarm();
		
		
	}
	
	public boolean checkAlarm() {
		if (floor2.checkFloorAlert()) {
			System.out.println("Alarm is ON!!!!!!!!oneone11!");
			return true;
		}
		System.out.println("Alarm is OFF. Everything is fine");
		return false;
	}
	
	public static void changeWindowState(boolean bool, Floor floor, int roomIndex, int windowIndex) {
		if (roomIndex >= floor.rooms.length) {
			System.out.println("Given room doesn't exist!");
		} else if (!(floor.rooms[roomIndex].isWindowInside())){
			System.out.println("There is no window in that room!");
		} else if (windowIndex >= floor.rooms[roomIndex].windows.length) {
			System.out.println("There is no " + (windowIndex+1) + " windows in that room");
		} else {
			if (bool) {
				System.out.println("Opening window");
			} else {
				System.out.println("Closing window");
			}
			floor.rooms[roomIndex].windows[windowIndex].setWindowState(bool);
		}
	}
	
	public static void changeSensorState(boolean bool, Floor floor, int roomIndex) {
		if (roomIndex >= floor.rooms.length) {
			System.out.println("Given room doesn't exist!");
		} else if (!(floor.rooms[roomIndex].isSensorInside())) {
			System.out.println("There is no sensor inside this room!");
		} else {
			if (bool) {
				System.out.println("Turning sensor ON");
			} else {
				System.out.println("Turning sensor OFF");
			}
			floor.rooms[roomIndex].sensor.setSensorState(bool);
		}
	}
	
	
}
