
public class order
{
private int orderId;
private int productId;
private int quantity;

public int getorderId() 
	{
	return orderId;
	}
public void setorderId(int orderId) 
	{
	this.orderId=orderId;
	} 


/*public boolean equals(Object obj)
 
	{
	order Order1=(order)obj;
	if(this.productId==Order1.productId && this.quantity==Order1.quantity)
	{
		return true;
	}
	return false;
	}


 public int hashCode() {
	 
	 int hashcode=0;
	 
	 hashcode= this.productId * 10 + this.quantity * 10;
	  
	 return hashcode;

 		}*/
 


public int getproductId() 
	{
	return productId;
	}
public void setproductId(int productId) 
	{
	this.productId=productId;
	}
public int getquantity() 
	{
return quantity;
	}
public void setquantity(int quantity) 
	{
this.quantity=quantity;
	}
public order(int productId, int quantity, int orderId) {
	super();
	this.productId = productId;
	this.quantity = quantity;
	this.orderId=orderId;
}

}
