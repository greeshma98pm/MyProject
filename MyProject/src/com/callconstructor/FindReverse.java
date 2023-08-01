package com.callconstructor;

public class FindReverse 
{
int num;

	public FindReverse(int num) 
	{
		this();
		int reverse=0;
		while(num!=0)
		{
			int lastdigit=num%10;
			reverse=reverse*10+lastdigit;
			num=num/10;
		}
		System.out.println(reverse);
	}
	
	public FindReverse() 
	{
		System.out.println("finding reverse...");
	}
	
	public static void main(String[] args) 
	{
		FindReverse t= new FindReverse(104);

	}

}
