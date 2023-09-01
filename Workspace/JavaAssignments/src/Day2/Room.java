package Day2;

public class Room {
	private int roomNo;
	private String roomType;
	private String roomArea;
	private boolean ACMachine;
	
	public Room() {
		super();
	}
	
	public Room(int roomNo, String roomType, String roomArea, boolean aCMachine) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.ACMachine = aCMachine;
	}

	/**
	 * @return the roomNo
	 */
	public int getRoomNo() {
		return roomNo;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return the roomArea
	 */
	public String getRoomArea() {
		return roomArea;
	}

	/**
	 * @param roomArea the roomArea to set
	 */
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	/**
	 * @return the aCMachine
	 */
	public boolean isACMachine() {
		return ACMachine;
	}

	/**
	 * @param aCMachine the aCMachine to set
	 */
	public void setACMachine(boolean aCMachine) {
		ACMachine = aCMachine;
	}

	public static void main(String[] args) {
		Room room1=new Room(1234,"Queen-Beded","Large",true);
		System.out.println(room1.getRoomNo());
		System.out.println(room1.getRoomType());
		System.out.println(room1.getRoomArea());
		System.out.println(room1.isACMachine());
	}
}
