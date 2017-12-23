package hash;

public class product 
{
private int productId;
private String name;
private float price;
private int quantity;
private String descripton;


public product() 
	{
	super();
	}

public int getProductId() {
	return productId;
	}

public void setProductId(int productId) {
	this.productId = productId;
	}

public String getName() {
	return name;
	}


public void setName(String name) {
	this.name = name;
	}

public float getPrice() {
	return price;
	}

public void setPrice(float price) {
	this.price = price;
	}

public int getQuantity() {
	return quantity;
	}

public void setQuantity(int quantity) {
	this.quantity = quantity;
	}

public String getDescripton() {
	return descripton;
	}

public void setDescripton(String descripton) {
	this.descripton = descripton;
	}

public product(int productId, String name, float price, int quantity, String descripton) {
	super();
	this.productId = productId;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.descripton = descripton;
}


}
