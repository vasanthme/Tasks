
public class RoadBike extends Bicycle{
	private int tirewidth;
	static int diskbrake;

	public RoadBike(int cadence, int speed, int gear, int tirewidth) {
		super(cadence, speed, gear);
		this.tirewidth = tirewidth;
	}

	public int getTirewidth() {
		return tirewidth;
	}

	public void setTirewidth(int tirewidth) {
		this.tirewidth = tirewidth;
	}
	
	public static int getDiskbreak() {
		return diskbrake;
	}
	
	public void printDescription() {
		System.out.println("RoadBike:");
		super.printDescription();
		System.out.println("RoadBike has tirewidth of:"+getTirewidth()+"mm.");
		
	}
	
	public void diskbreak(int diskbrake) {
		System.out.println("Disk Brake for RoadBike is :"+diskbrake);
		
	}

}
