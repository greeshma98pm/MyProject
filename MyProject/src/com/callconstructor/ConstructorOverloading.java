package com.callconstructor;

import java.util.Scanner;

public class ConstructorOverloading {
int sum;

public ConstructorOverloading(int sum)
{
	this();
	if(this.sum%10==0)
	{
		System.out.println(this.sum + " is divisible by 10 ");
	}
	else
	{
		System.out.println(this.sum + " is not divisible by 10 ");
	}
}

public ConstructorOverloading()
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1: ");
	int num1=sc.nextInt();
	System.out.println("enter num2: ");
	int num2=sc.nextInt();
	sum=num1+num2;
	System.out.println(sum);
}

	public static void main(String[] args) {
	
		ConstructorOverloading obj=new ConstructorOverloading(0);
		
	}

}
