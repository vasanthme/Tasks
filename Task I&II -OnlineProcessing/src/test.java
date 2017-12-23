

public class test {

	public static void main(String[] args) {
		
		order Order= new order(1001,50,501);
	
		/*order Order1=new order(1001,50,502);
	
	
	/*System.out.println(Order.equals(Order1));
		
	System.out.println(Order.hashCode());
	System.out.println(Order1.hashCode());*/
	
	
	//System.out.println(Order.toString());
	//System.out.println(Order1.toString());
	
	
		orderservice orderserv=new orderservice();
		orderserv.processorder(Order);

	}

}
