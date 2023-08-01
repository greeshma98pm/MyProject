//30.Write a program to find the grade of 2 students based on total marks(3 subjects) 
// Get the student‟s marks by constructor 
// Return total mark to in main method  Find the grade of each student.

package com.programs;
import java.util.*;
public class FindGrade {
	float totalmarks;
	
	public FindGrade()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Marks for subject1: ");
		float sub1=sc.nextFloat();
		System.out.print("Marks for subject2: ");
		float sub2=sc.nextFloat();
		System.out.print("Marks for subject3: ");
		float sub3=sc.nextFloat();
		totalmarks=sub1+sub2+sub3;
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Enter the marks of student1: ");	
		FindGrade obj1=new FindGrade();
		if(obj1.totalmarks>280)
		{
			System.out.println("Grade is A");
		}
		else if(obj1.totalmarks>250 && obj1.totalmarks<=280)
		{
			System.out.println("Grade is B");
		}
		else if(obj1.totalmarks>200 && obj1.totalmarks<=250)
		{
			System.out.println("Grade is C");
		}
		else if(obj1.totalmarks>150 && obj1.totalmarks<=200)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		System.out.println("Enter the marks of student2: ");	
		FindGrade obj2=new FindGrade();
		if(obj2.totalmarks>280)
		{
			System.out.println("Grade is A");
		}
		else if(obj2.totalmarks>250 && obj2.totalmarks<=280)
		{
			System.out.println("Grade is B");
		}
		else if(obj2.totalmarks>200 && obj2.totalmarks<=250)
		{
			System.out.println("Grade is C");
		}
		else if(obj2.totalmarks>150 && obj2.totalmarks<=200)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("Failed");
		}
	
	}

}
