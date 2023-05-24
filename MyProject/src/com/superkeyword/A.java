package com.superkeyword;

public class A 
{
	int a;
	
	A()
	{
		System.out.println("PARENT DEFAULT CONSTRUCTOR");
	}
	
	A(int a)
	{
		System.out.println("PARENT PARAMETRIZED CONSTRUCTOR");
	}
	
	public void display()
	{
		System.out.println("parent display");
	}
	
}
