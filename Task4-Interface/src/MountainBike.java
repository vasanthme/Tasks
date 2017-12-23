//Mountain bike typically has full suspension,powerful Brakes,gears and seat height.
public class MountainBike extends Bicycle {
    private String suspension;
	private int seatHeight;
	
	public MountainBike(int cadence, int speed, int gear, String suspension, int seatHeight) {
		super(cadence, speed, gear);
		this.suspension = suspension;
		this.seatHeight = seatHeight;
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
public void printDescription(){
	
	System.out.println("-----------------------");
	System.out.println("MountainBike:");
	super.printDescription();
	System.out.println("MountainBike has a Seatheight of: "+getSeatHeight()+ "   "+"Suspension of"+getSuspension());
	
}
	
}
