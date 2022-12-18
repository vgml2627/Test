package Basics;

import java.util.Scanner;

public class AirthematicOperator {

	public static void main(String[] args) {
		int a ,b , c;
		
		System.out.println("Adding two number from user input");
		Scanner Scanner =new Scanner(System.in);
		System.out.println("Ente the first value");
		int num1=Scanner.nextInt();
		System.out.println("Ente the Second value");
		int num2=Scanner.nextInt();
		
		a=num1+num2;
		b=num1/num2;
		c=num1%num2;
		
		System.out.println("Addition total is "+ a);
		System.out.println("Addition total is "+ b);
		System.out.println("Addition total is "+ c);
				
	}

}

//code done by my own knowledge very first time.
