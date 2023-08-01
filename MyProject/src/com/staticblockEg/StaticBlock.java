package com.staticblockEg;

public class StaticBlock 
{
	String name;
	int age;
	
	static String school="ABC";
	
	public StaticBlock()
	{
		name="Raj";
		age=12;
		System.out.println("default constructor");
	}
	
	public StaticBlock(int a)
	{
		System.out.println("parametrized constructor");
		name="Anu";
		age=12;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(StaticBlock.school);

	}
	
	static {
		
		System.out.println("static block");
		school="xyz";
		
	}

}


//if there is a static block in a class, it will execute initially before a main method
// O/P:   static block
//        xyz

