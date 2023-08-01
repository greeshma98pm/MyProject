package com.thiskeyword;

public class ThisTest 
{
String name;
int age;

	public static void main(String[] args) 
	{
		String name="Anju";
		ThisTest t = new ThisTest();
		t.name = "Raj";
		t.display();
		
	}

	void display()
	{
		String name="Arun";
		System.out.println(name);
		System.out.println(this.name);
	}
	
}
