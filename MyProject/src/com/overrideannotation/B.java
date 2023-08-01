package com.overrideannotation;

public class B extends A{

	public static void main(String[] args) 
	{
		
		B objB = new B();
		
	}

	@Override
	public void display()
	{
		System.out.println("child display");
	}
	
	//override annotation not possible for print() as it is not override method
	public void print()
	{
		System.out.println("print");
	}
}
