
public class orderservice {
	
	ProductDBStore productDBStore=new ProductDBStore();
	
	public void processorder(order Order)
	{
		int pid;
		int ordquantity;
		int stockavail;
		
		
		
		pid=Order.getproductId();
		ordquantity=Order.getquantity();
		
		for(int i=0;i<productDBStore.pro.length;i++)

		{
			product prod=productDBStore.pro[i];
			
			stockavail=productDBStore.pro[i].getQuantity();
			
				
			if(prod.getProductId()==pid)
			{
				System.out.println("Stock available before order processing is:"+stockavail);
				
				if(ordquantity<=prod.getQuantity()) {
					
					System.out.println("Order is processed");
					
					int updatedstock=prod.getQuantity()-ordquantity;
					Order.setquantity(updatedstock);
					System.out.println("Stock Updated in Order Class is:"+Order.getquantity());
					System.out.println("Stock available is:"+updatedstock);
				
				}
				else 
					System.err.println("Out of stock");
					
			}
			
		}
		
	}

}

