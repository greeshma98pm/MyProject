package com.polymorphism;

public class Circle extends Shape{

	public static void main(String[] args) 
	{
	Circle obj=new Circle();	
    obj.findingArea();
    obj.display();
    
    Shape obj1=new Shape();
    obj1.findingArea();
	}
    public void findingArea()
	
	{
		System.out.println("Finding Area of circle");
		int r=10;
		area=r*r*3.14f;
		
	}
}
