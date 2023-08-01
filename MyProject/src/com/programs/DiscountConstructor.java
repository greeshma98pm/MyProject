//29. Write the above program with parameterized constructor (to calculate total amount). (instance methods)
//Ie, program to check whether the customer have discount 
//(get 20% discount if total amount is greater than 5000) or not 
//and get the final amount in main method. (static methods) • Get prices of items using parameterized method • Method 1 - Calculate total amount • Method 2 - Check discount 

package com.programs;
import java.util.Scanner;

public class DiscountConstructor {

	double price;
	int quantity;
	double total_amt;
	
	public static void main(String[] args) 
	{
		
		
		DiscountConstructor obj=new DiscountConstructor(0.00);
		
	}

	public DiscountConstructor(double price,int quantity)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price of item: ");
		price=sc.nextDouble();
		
		System.out.println("Enter quantity of item: ");
		quantity=sc.nextInt();
		
		total_amt=price*quantity;
		System.out.println("Total amount is: " + total_amt);
		
	}
	
	public DiscountConstructor(double total_amt)
	{
	    this(0.00, 0);
		if(this.total_amt>5000)
		{
			double discount=this.total_amt*0.20;
			System.out.println("Discount is : " + discount);
			total_amt=this.total_amt-discount;
			System.out.println("final amount is: " + total_amt);
		}
		else
		{
			System.out.println("final amount is: " + this.total_amt);
			System.out.println("Purchase for above 5000 rs to avail discount");
		}
	}
}
