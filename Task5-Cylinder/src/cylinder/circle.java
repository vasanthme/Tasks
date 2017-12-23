package cylinder;


public class circle extends ImplementAbstract {

public circle(double radius) {
	super();
	this.radius = radius;
	}

//Calculating Area
public void area()
	{
	
double CircleArea= Math.PI*radius*radius;
System.out.println("Area of Circle is:"+CircleArea);

	}

//Calculating Circumference of a circle
public void circumference()
	{
	double CircleCircumference= 2*Math.PI*radius;
	System.out.println("Circumference Of a Circle is:"+CircleCircumference);
	}
	
}
