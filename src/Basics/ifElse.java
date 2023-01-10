package Basics;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		int ticketPrice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of ticket purchased to know status:");
		ticketPrice=scanner.nextInt();
		
		if(ticketPrice>1500)
		{
			System.out.println("Your ticket is confirmed to birth");
		}
		else if(ticketPrice>=750)
		{
			System.out.println("Your ticket is confirmed to sleeper");
		}
		else if(ticketPrice>500)
		{
			System.out.println("Your ticket is confirmed to semi-sleeper");
		}
		else
		{
			System.out.println("Your ticket is confirmation is under-waiting");
		}
	}

}
