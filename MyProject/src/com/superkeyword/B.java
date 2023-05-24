package com.superkeyword;

public class B extends A
{
		int a;
		
		B()
		{
			System.out.println("CHILD DEFAULT CONSTRUCTOR");
		}
		
		B(int a)
		{
			System.out.println("CHILD PARAMETRIZED CONSTRUCTOR");
		}

	public static void main(String[] args) 
	{
		B objB = new B();

	}

}
