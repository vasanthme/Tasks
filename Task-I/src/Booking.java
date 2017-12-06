
public class Booking 
{
	// Instance Variable/ Non-Static Variable/Fields
	String brand;
	String model;
	int quantity;
	float price;
	String color;

	
	// Default Constructor
	public Booking()
		{
	
		}
	//Non-Static Method
	public void cart()
	{
		if(brand == "Mac")
		{
			System.out.println("Brand you have choosen is:"+ brand);
		} if(model== "Pro13")
		{
			System.out.println("Model is:"+model);
		} if(color=="White")
		{
			System.out.println("color is:"+color);
		}
		if(quantity>0)
		{
			price=quantity*price;
			System.out.println("Total Price is:"+price);
			System.out.println("Order Placed Successfully");
			System.out.println("Click 'More Options' for other brands");
			System.out.println("-----------------------------");
		}
	}
	
	public void cart1(String brand,String model,int quantity,float price,String color)
	{
		if(brand != "Mac")
		{
			System.out.println("Brand you have choosen is:"+ brand);
		} if(model!= "Pro13")
		{
			System.out.println("Model is:"+model);
		} if(color!="White")
		{
			System.out.println("color is:"+color);
		}
		if(quantity>0)
		{
			price=quantity*price;
			System.out.println("Total Price is:"+price);
		}
	}
}
