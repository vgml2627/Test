package Basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a ;
		Scanner Scanner =new Scanner(System.in);
		System.out.println("Enter the number to display the day:");
		a=Scanner.next().charAt(0);
		
	switch(a)
	 {
	 case '1' :
		 System.out.println("The day is Monday");
		 break;
	 case '2' :
		 System.out.println("The day is Tuesday");
		 break;
	 case '3' :
		 System.out.println("The day is Wednesday");
		 break;
	 case '4' :
		 System.out.println("The day is Thursday");
		 break;
	 case '5' :
		 System.out.println("The day is Friday");
		 break;
	 case '6' :
		 System.out.println("The day is Saturday");
		 break;
	 case '7' :
		 System.out.println("The day is Sunday");
		 break;
		 default:
		 System.out.println("No days in the year calender");
	 }
	}

}
