package com.thiskeyword;

public class ThissTest 
{
	String name;
	int age;

	public static void main(String[] args) 
	{
		String name="Anju";
		ThissTest t = new ThissTest();
		t.name = "Raj";
		t.display();
	}

	void display()
	{
		String name="Arun";
		System.out.println(name);
		System.out.println(this.name); //t.name
		this.print();       // t.print
	}
	
	void print()
	{
		System.out.println(this.name);  //t.name
	}
	
}
