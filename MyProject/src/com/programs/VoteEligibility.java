package com.programs;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name: ");
	String name=sc.next();
	System.out.println("Enter age: ");
	int age=sc.nextInt();
	
	 boolean result=VoteEligibility.eligible(age);
     if(result==true)
     {
    	 System.out.println(name + " is eligible for voting");
     }
     else
     {
    	 System.out.println(name + " is not eligible for voting");
     }
	}

	public static boolean eligible(int age)
	{
		if(age>18)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}


//25. Write a program to check whether the candidate is eligible for Voting
//(Use static method and boolean return type).

