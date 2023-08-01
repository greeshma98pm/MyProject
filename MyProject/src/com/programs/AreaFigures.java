//31. Write a program to find the Area of figures 
//a) Circle (pi*r*r) b) Rectangle(l*b) c) Square(a*a) 
// Prompt the user to select the options(a/b/c) from command prompt. 
// Get the inputs that needs to find area.

package com.programs;

import java.util.Scanner;

public class AreaFigures {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Area Calculator");
		System.out.println("Select an option");
		System.out.println("a) Circle");
		System.out.println("a) Rectangle");
		System.out.println("a) Square");
		System.out.print("select an option: a/b/c: ");
		char selectedoption=sc.next().charAt(0);
		
		switch(selectedoption)
		{
		case 'a': System.out.println("Enter radius of circle: ");
				  double r=sc.nextDouble();
				  double circlearea=AreaFigures.circle(r);
				  System.out.println("Area of circle is: " + circlearea);
				  break;
				  
		case 'b': System.out.println("Enter length of Rectangle: ");
		  		  double l=sc.nextDouble();
		  		  System.out.println("Enter breadth of Rectangle: ");
		  		  double b=sc.nextDouble();
		          double rectanglearea=AreaFigures.rectangle(l,b);
		          System.out.println("Area of rectangle is: " + rectanglearea);
		          break;
		          
		case 'c': System.out.println("Enter side of Square: ");
		  		  double a=sc.nextDouble();
		  		  double squarearea=AreaFigures.square(a);
		  		  System.out.println("Area of Square is: " + squarearea);
		  		  break; 
		  		  
		default: System.out.println("invalid response");
		  		  
		}

	}
	static double circle(double r)
	{
		double circlearea=(3.14*r*r);
		return circlearea;
	}
	
	static double rectangle(double l, double b)
	{
		double rectanglearea=(l*b);
		return rectanglearea;
	}
	
	static double square(double a)
	{
		double squarearea=(a*a);
		return squarearea;
	}


}
