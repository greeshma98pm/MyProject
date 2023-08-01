package com.inheritance;

public class HierarchicalC extends HierarchicalA
{

	public void display2()
	{
		System.out.println("child 2");
	}
	
	public static void main(String[] args) 
	{
		
		HierarchicalC obj = new HierarchicalC();
		obj.display();
		obj.display2();
		
	}

}
