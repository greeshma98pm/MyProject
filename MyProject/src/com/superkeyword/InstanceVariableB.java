package com.superkeyword;

public class InstanceVariableB extends InstanceVariableA 
{
	int a;  //instance variable of child class
	
	public static void main(String[] args) 
	{
		
		InstanceVariableB objB = new InstanceVariableB();
		objB.a = 10;   //Will assign value to instance variable of child class
		objB.display();  //Child display executes by overriding

	}

	public void display()
	{
		
		System.out.println("Child display");
		System.out.println(this.a);    // current class/child class value prints --> 10
		System.out.println(super.a);   // parent class value prints --> 0
		
	}

}
