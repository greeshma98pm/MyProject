package com.aggregation;

public class Student1 {

	public int rollno;
	public String name;
	public Address1 address;
	
	Student1()
	{
		
		rollno=22;
		name="Anu";
		address=new Address1();
		System.out.println(name + " " + rollno);
		System.out.println(address.city + " " +address.state + " " + address.country);
	}
	public static void main(String[] args) 
	{
		
		Student1 obj= new Student1();
		
	}

}
