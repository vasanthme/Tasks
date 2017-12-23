
public class TestBicycle {

	public static void main(String[] args) {
		
		Bicycle bicycle=new Bicycle(12,8,2);
		bicycle.printDescription();
		bicycle.speedup(10);
		System.out.println("Bicycle New Speed is:" + bicycle.getSpeed());
		
		
		//Mountain Bike has gears of 15,18,21,24 or 27 and Dual/full suspension
		MountainBike mountainBike=new MountainBike(15, 18, 8, "Dual", 15);
		mountainBike.printDescription();
		mountainBike.speedup(12);
		System.out.println("MountainBike New Speed is:" + mountainBike.getSpeed());
		System.out.println("-----------------------");

		
		//Road Bike has Skinny Tires 
		RoadBike roadBike=new RoadBike(18, 12, 5, 35);
		roadBike.printDescription();		
		roadBike.diskbreak(5);
		roadBike.applyBrakes(4);
		System.out.println("RoadBike New Speed is:" + roadBike.getSpeed());
		System.out.println("-----------------------------");
	
		
		//TandemBike has Two Pedal and Two Saddle
		TandemBike tandemBike=new TandemBike(14, 15, 5, 2, 4);
		tandemBike.printDescription();
		tandemBike.speedup(12);
		System.out.println("TandemBike New Speed is:" + tandemBike.getSpeed());
		
	}

}
