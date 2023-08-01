package com.superkeyword;

public class ConstructorA 
{
	int a;
	
    ConstructorA()
	{
		System.out.println("PARENT DEFAULT CONSTRUCTOR");
	}
	
	ConstructorA(int a)
	{
		System.out.println("PARENT PARAMETRIZED CONSTRUCTOR");
	}
	
	public void display()
	{
		System.out.println("parent display");
	}
	
}
