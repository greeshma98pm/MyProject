package com.encapsulation;

public class Demo {

	public static void main(String[] args) 
	{

		Human obj = new Human();
		//obj.age=11;
		//obj.name="greesh";
		//System.out.println(obj.age);
		//System.out.println(obj.name);
		
		//System.out.println(obj.getAge() + ":" + obj.getName());
		
		obj.setAge(30);
		obj.setName("nivin");
		System.out.println(obj.getAge() + ":" + obj.getName());
	}

}
