//27. Write a program to check whether the customer have discount 
//(get 20% discount if total amount is greater than 5000) or not and get the final amount in main method. 
//(static methods)  Get prices of items using parameterized method 
// Method 1 - Calculate total amount  Method 2 - Check discount 


package com.programs;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of item: ");
		double price=sc.nextDouble();
		System.out.println("Enter the quantity of item: ");
		int quantity=sc.nextInt();
		
		double total_amt=Discount.totalAmount(price, quantity);
		
		double result=Discount.checkDiscount(total_amt);
		
		if(result!=total_amt)
		{
			System.out.println("Final amount is : " + result);
		}
		else
		{
			System.out.println("Purchase for above 5000 rs to avail discount");
		}
	}

	public static double totalAmount(double price,int quantity)
	 
	{
		double total_amt= price*quantity;
		System.out.println("Total amount is : " + total_amt);
		return total_amt;
	}
	
	public static double checkDiscount(double total_amt)
	
	{
		if(total_amt>5000)
		{
			double discount=total_amt*0.20;
			System.out.println("Discount is : " + discount);
			total_amt=total_amt-discount;
			return total_amt;
		}
		
		else
		{
			return total_amt;
		}
	}
}
