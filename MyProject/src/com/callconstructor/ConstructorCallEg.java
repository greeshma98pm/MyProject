package com.callconstructor;

public class ConstructorCallEg 
{
String name;
int age;
static String school="ABC";

	public ConstructorCallEg()
	{
		this("Anu");          // means ConstructorCallEg("Anu")
		System.out.println("default constructor");
	}

	public ConstructorCallEg(String name)
	{
		System.out.println("parametrized constructor");
	}
	
	public static void main(String[] args) 
	{
		String name = "Anju";
		ConstructorCallEg t = new ConstructorCallEg();
	}

}
