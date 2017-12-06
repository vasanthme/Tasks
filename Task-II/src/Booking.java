
public class Booking {
	
	//Instance Variable/Non-Static/Fields
	String brand;
	String model;
	int quantity;
	float price;
	String color;
	float discount;
	
	// Parameterized Constructor
	public Booking(String brand, String model,int quantity, float price, String color,float discount)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.quantity=quantity;
		this.price = price;
		this.color = color;
		this.discount=discount;
	}
	// Non-Static Method
	public void cart () 
	{
		if(this.brand == "Mac")
		{
			System.out.println("Brand you have choosen is:"+ this.brand);
		} if(this.model== "Pro13")
		{
			System.out.println("Model is:"+this.model);
		} if(this.color=="White")
		{
			System.out.println("color is:"+this.color);
			System.out.println("----------------------------");
		}
	}
	
	//Method OverLoading
	public void cart (int quantity)
	{
		if(this.quantity>0 && this.brand=="Mac")
		{
			this.price=this.quantity*this.price;
			System.out.println("Price before discount is:"+this.price);
		} if (this.price >=1000 && this.price<=4000)
		{
			discount=((this.price/100)*this.discount);
			this.price=this.price-discount;
			System.out.println("Discount amount is :"+discount);
			System.out.println("Price after discount is:"+this.price);
			System.out.println("----------------------------");
		}
		else 
		{
			System.out.println("Brand which you have choosen is not a MAC");
			System.out.println("Please select appropriate brand");
		}
	}
}
