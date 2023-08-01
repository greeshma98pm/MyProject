package com.superkeyword;

public class ConstructorB extends ConstructorA
{
		int a;
		
		ConstructorB()
		{
			super(1);
			System.out.println("CHILD DEFAULT CONSTRUCTOR");
		}
		
		ConstructorB(int a)
		{
			System.out.println("CHILD PARAMETRIZED CONSTRUCTOR");
		}

	public static void main(String[] args) 
	{
		
		ConstructorB objB = new ConstructorB();
		//even if we didn’t write any constructor invocation, 
		//there will be an invocation from all child constructor to parent default constructor.
		
	}

}
