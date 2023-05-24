//28. Write a program to find the
//b) Area of figures(circle, rectangle, square) by using three methods
//(should have same method name)

package com.programs;

public class FiguresArea {

	public static void main(String[] args) 
	{
		FiguresArea.area(3);
		FiguresArea.area(4, 3);
		FiguresArea.area(5f);
	}

	public static void area(int r)
	
	{
		System.out.println("Area of circle is: " + (3.14*r*r) );
	}
	
    public static void area(int l, int b)
	
	{
    	System.out.println("Area of rectangle is: " + (l*b) );
	}

    public static void area(float a)

    {
    	System.out.println("Area of square is: " + (a*a) );
    }
}
