package com.programs;

import java.util.Scanner;

public class StaticPalindrom {

	public static void main(String[] args) 
	{
		
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int reverse=StaticPalindrom.reverse(num);
StaticPalindrom.palindrome(num,reverse);

	}

	public static int reverse(int num)
	{
		
	int reverse=0;
	while(num!=0)
	{
	int lastdigit=num%10;
	reverse=reverse*10+lastdigit;
	num=num/10;
	}
	System.out.println("reverse is: " + reverse);
	return reverse;
	
	}
	
	public static void palindrome(int num, int reverse)
	
	{
		if(num == reverse)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}
	
}


//24. Write a program to check whether the given number is Palindrome/Not 
//by using static methods. • Method 1- to find the reverse(pass the number in argument) 
//• Method 2-to check palindrome/not 



