package cylinder;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle cir=new circle(2);
		rectangle rect=new rectangle(2,6);

		cir.area();
		cir.circumference();
		rect.circumference();
		
		System.out.println("Area of Cylinder is: "+ rect.AreaOfCylinder(6,2));

	}

}
