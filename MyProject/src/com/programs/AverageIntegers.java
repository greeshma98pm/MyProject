//28. Write a program to find the 
//a) Average of three integer numbers, three float numbers
//(should have same method name)


package com.programs;

public class AverageIntegers {

	public static void main(String[] args) 
	
	{
		AverageIntegers.average(10, 20, 30);
		AverageIntegers.average( 20f,50f ,30f );
		
	}
 
	public static void average(int a, int b, int c)
	
	{
		int average=(a+b+c)/3;
		System.out.println("Average of 3 integers is: " + average);
	}
	
    public static void average(float a,float b,float c)
	
	{
		float average=(a+b+c)/3;
		System.out.println("Average of 3 float numbers is: " + average);
	}
	
}
