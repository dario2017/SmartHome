package smartdom;

public class Floor {
	private static int floorIdCounter;
	private int floorId;
	Room[] rooms;
	
	public Floor() {
		floorIdCounter++;
		this.floorId = floorIdCounter;
	}
	
//	use it only to create rooms in first floor
	public void createFirstFloorRooms() {
		rooms = new Room[4];
		rooms[0] = new Room("Kitchen", 1);
		rooms[1] = new Room("Bathroom", 2);
		rooms[2] = new Room("Room", 0);
		rooms[3] = new Room("Bedroom", 1);
	}
	
//	use it only to create rooms in second floor
	public void createSecondFloorRooms() {
		rooms = new Room[3];
		rooms[0] = new Room("Room", 1);
		rooms[1] = new Room("Room", 1);
		rooms[2] = new Room("Guestroom", 4);
	}
	
	public boolean checkFloorAlert() {
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i].checkRoomAlarm()) {
				return true;
			}
		}
		return false;
	}
	
}
