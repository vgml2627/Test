package Basics;

public class FirstandLast {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<=5;i++)
		{
			for(j=0;j<=5;j++)
			{
				if(j==1||j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
		
	}

}
