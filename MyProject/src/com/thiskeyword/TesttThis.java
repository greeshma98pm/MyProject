package com.thiskeyword;

public class TesttThis 
{

String name;
int age;

	public static void main(String[] args) 
	{
		String name="Anju";
		TesttThis t = new TesttThis();
		t.name = "Raj";
		t.display();
		System.out.println(t.name);
	}

	void display()
	{
		String name="Arun";
		System.out.println(name);
		// System.out.println(t.name);
		//error will occur here as object t is declared in the main method.
	}
}
