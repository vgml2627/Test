package Basics;

import java.util.Scanner;

public class gettingInputs {

	public static void main(String[] args) {
	
	Scanner Scanner=new Scanner(System.in);
    System.out.println("May i know your name??");
    String name=Scanner.nextLine();
    System.out.println("May i know your Age??");
    int age=Scanner.nextInt();
    
    Scanner.nextLine();
    //With this line email id scanning not works because the complier take enter as one character
    
    System.out.println("May i know your mail-ID??");
    String mail=Scanner.nextLine();
    System.out.println("Welcome on Board!!!" +name);
    System.out.println("Good to know!!!"+ age + " Is your age");
    System.out.println("Thanks for it !!!" +mail);
	}   

}
