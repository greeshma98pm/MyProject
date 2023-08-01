package com.superkeyword;

public class MethodB extends MethodA
{

	public static void main(String[] args) 
	{
		
		MethodB objB = new MethodB();
		objB.display();  //Normally, override will work here and child display executes.
		                //super used to execute parent display also in this single call.
	}
	
	public void display()
	{
		
		super.display();  //super used to refer parent class object from child class.
		System.out.println("Child display");
	}

}
