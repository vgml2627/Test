package Basics;

import java.io.IOException;

public class ExceptionHnadling {

	public static void main(String[] args) {
		int a=10,b=0;
		//int c = a/b; 
		// Complier stop here so other line of code wont get complied.In order to overcome we have used Try/Catch.
		
		System.out.println("Processing");
		try
		{
			int c;
			 c = a/b; 
			System.out.println("Processed"+" " +c);
		}
 
		catch(Exception e)
		{
	    System.out.println("Error occured");
		}
		
		

	}

}
