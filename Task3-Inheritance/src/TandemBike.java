
public class TandemBike extends Bicycle {
	int saddle;
	int pedal;
	
	public TandemBike(int cadence, int speed, int gear, int saddle, int pedal) {
		super(cadence, speed, gear);
		this.saddle = saddle;
		this.pedal = pedal;
	}
	
	
public void printDescription(){
	System.out.println("TandemBike:");
	super.printDescription();
	System.out.println("TandemBike has: "+saddle+""+"saddle"+ " &"+pedal+""+"Pedal");
	
	}

}
