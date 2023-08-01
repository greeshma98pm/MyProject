package com.thiskeyword;

public class TestttThis 
{
	String name;
	int age;

	public static void main(String[] args) 
	{
		String name="Anju";
		TestttThis t = new TestttThis();
		t.name = "Raj";
		t.display();
	}

	void display()
	{
		TestttThis t = new TestttThis();
		String name="Arun";
		System.out.println(name);
		System.out.println(t.name);
	}
}
//Here object t's are different for both main method & display()
//so, as object t is not given any value in display(), it will take a null value.