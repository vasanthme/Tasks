
public class Bicycle implements BicycleInterface{
	
	private int cadence;
	private int speed;
	private int gear;
	
	public Bicycle(int cadence, int speed, int gear) {
		super();
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
	}
	
	public void setCadence(int newvalue) {
		this.cadence = newvalue;
	}
	
	public int getCadence() {
		return this.cadence;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getGear() {
		return this.gear;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setGear(int newvalue) {
		this.gear = newvalue;
	}
	
	public void speedup(int increment) {
		speed=speed+increment;
	}
	
	public void applyBrakes(int decrement) {
		speed= speed-decrement;
		}
	public void printDescription() {
		System.out.println("Bike is in gear:"+this.gear+"  "+"with cadence of:"+this.cadence+"   "+"travelling at a speed of:"+this.speed);
		
	}
	
	
}
