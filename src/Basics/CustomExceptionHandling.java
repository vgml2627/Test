package Basics;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) {
		int voting_age=18;
		int i ;
		System.out.println("Enter the age to check eligibility");
		
		try(Scanner sc=new Scanner(System.in))
		{
			i=sc.nextInt();
			if(i<=voting_age)
			{
				System.out.println("Not-Eligible for vote");
			}
		}
		
		catch(Exception e)
			{
					System.out.println("Eligible for vote");
				}
			 	
		}
}

