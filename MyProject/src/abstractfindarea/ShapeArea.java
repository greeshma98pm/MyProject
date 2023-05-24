package abstractfindarea;

public class ShapeArea extends FindArea 
{

	@Override
	void circle() 
	
	{
		double r=3;
	    double area=(3.14*r*r);
		System.out.println("Area of circle is :" + area );
	}

	@Override
	void rectangle() 
	{
		int l=4;
		int b=3;
		int area=l*b;
		System.out.println("Area of rectangle is :" + area );
		
	}

	
}
