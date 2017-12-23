
public class ProductDBStore 
{

	product[] pro= new product[5];

	public ProductDBStore() 
	{
		
		pro[0]=new product(1001,"HP", 1100.00f, 50, "HDD=500GB,RAM=8GB");
		pro[1]=new product(1002, "Lenovo", 900.00f, 35, "HDD=1TB,RAM=8GB");
		pro[2]=new product(1003, "Dell", 1050.00f, 25, "HDD=2TB,RAM=16GB");
		pro[3]=new product(1004, "MAC", 1800.00f, 100, "HDD=128GB,RAM=8GB");
		pro[4]=new product(1004, "Toshiba", 1400.00f, 60, "HDD=500GB,RAM=8GB");
	}
	
 
}
