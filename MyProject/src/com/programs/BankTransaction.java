//26. Write a program to deposit and withdraw amount from bank account
//(Withdrawal amount do not exceeds the current balance).
//Add an extra method to check the account balance. (static methods) 


package com.programs;

import java.util.Scanner;

public class BankTransaction {

	int acNo=111;
	int acPass=222;
	String acName="greeshma";
	public long acbalance=1000;
	
	public static void main(String[] args) 
	
	{
		BankTransaction obj1= new BankTransaction();
		boolean result =  obj1.accountDetails();
		if(result==true) {
			obj1.showMenu();
		}
	}
	
	public boolean accountDetails()
	{
		
	System.out.println("Welcome To ABC Bank");	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your ABC Account Number");
	int ac_No=sc.nextInt();
	System.out.println("Enter Your ABC Account password");
	int ac_Pass=sc.nextInt();
	System.out.println("Enter Your ABC Account Name");
	String ac_Name=sc.next();
	if( (acNo==ac_No)& (acPass==ac_Pass) & (acName.equals(ac_Name))  )
	{
		System.out.println("Congratulations " + ac_Name +". You are successfully login to ABC Bank account. ");
		return true;
	}
	else
	{
		System.out.println("Sorry!!!! Invalid credentials.");
		return false;
	}
	
	}
	
    public void showMenu()
	
	{
		System.out.println("please select an option below: ");
		System.out.println("Press 1 to withdraw amount. ");
		System.out.println("Press 2 to deposit amount. ");
		System.out.println("Press 3 to check balance. ");
		System.out.println("Press any key to exit ");
		
		System.out.print("Press any key: ");
		Scanner sc=new Scanner(System.in);
		int selectedOption=sc.nextInt();
		
		
		switch(selectedOption)
		{
		
		case 1 : acbalance=this.withdraw();
		         showMenu();
		         break;
		         
		case 2 : acbalance=this.deposit();
			     showMenu();
                 break;
                 
		case 3 : this.checkBalance();
				 showMenu();
                 break; 
        
        default: System.out.println("Transaction ended!!! Your ABC bank account logout successfully");
        
		}
		
		
	}
	
	public long withdraw()
	
	{
		System.out.print("Enter amount to withdraw: ");
		Scanner sc=new Scanner(System.in);
		long w_amt=sc.nextLong();
		if(w_amt<=acbalance)
		{
		acbalance=acbalance-w_amt;
		System.out.println("please collect your " + w_amt + " rupees.");
		System.out.println("Your Available balance is " + acbalance + " rupees.");
		return acbalance;
		}
		
		else
		{
			System.out.println("Invalid withdrawal amount!!!");
			return acbalance;
		}
	}
	
public long deposit()
	
	{
		System.out.print("Enter amount to deposit: ");
		Scanner sc=new Scanner(System.in);
		long d_amt=sc.nextLong();
		
		if(d_amt<=0)
		{
			System.out.println("Invalid deposit amount.");
			return acbalance;
		}
		
		else
		{
		acbalance=acbalance+d_amt;
		System.out.println("Amount deposited successfully.");
		System.out.println("Your Account balance is " + acbalance + " rupees.");
		}
		return acbalance;
	}
	
public void checkBalance()

{
	System.out.println("Your Account Balance is: "+ acbalance); 
}

}
