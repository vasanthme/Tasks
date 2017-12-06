
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b= new Booking();
		Booking b1= new Booking();
		
		
		b.brand="Mac";
		b.model="Pro13";
		b.quantity=5;
		b.price=1200.00f;
		b.color="White";
	
	/**	b1.brand="HP";
		b1.model="I2650";
		b1.quantity=2;
		b1.price=950.00f;
		b1.color="Black"; **/
	
				b.cart();
				b1.cart1("HP","I2650",2,950.00f,"Black");
				

	}

}
