package Basics;

import java.util.Scanner;

public class doWhileInput {

	public static void main(String[] args) {
		int i=1,n;
		System.out.println("sum of N natural number");
        Scanner Scanner =new Scanner (System.in);
        n=Scanner.nextInt();
        
        while(i<=n)
        {
        	System.out.println(i);
        	i++;
        }
	}

}
