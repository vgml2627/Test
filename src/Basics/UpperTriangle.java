package Basics;

public class UpperTriangle {

	public static void main(String[] args) {
		int i,j,k,l;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<i;k++) // Removing "=" symbol to reduce one column
			{
				System.out.print("*");
			}
			for(j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			
		    System.out.print("\n");
		    
		}
		

	}

}
