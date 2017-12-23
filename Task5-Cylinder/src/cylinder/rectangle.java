package cylinder;


public class rectangle extends circle {
	
	double height;
	
	
	
	public rectangle(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	
	public double getHeight() {
		return this.height;
	}


	public void setHeight(double height) {
		if(height>0)
		{
		this.height = height;
		}else {
			this.height=0;
		}
		
	}


	//overRidding Circumference method
	public void circumference()
	{
		double area= 2*Math.PI*radius*height;
		System.out.println("Area of Curved Surface is:"+area);
	}
	
	public double  AreaOfCylinder(double height,double radius)
	{
		//area= Area of Top and Bottom Circles+Area of Curved Surface
		
		double area=(2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
		return area;
		
	}
	
}
