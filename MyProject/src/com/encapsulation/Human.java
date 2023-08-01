package com.encapsulation;

public class Human 
{
	
	private int age;
	private String name;
	
	public int getAge()    //method to get age for other class
	{
		return age;
	}

	public String getName() //method to get name for other class
	{
		return name;
	}
	
	public void setAge(int a)   //method to set age from other class 
	{
		age=a;
	}
	
	public void setName(String n)  //method to set name from other class
	{
		name=n;
	}
	
}
