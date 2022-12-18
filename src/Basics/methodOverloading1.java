package Basics;

public class methodOverloading1 {

	static int average (int a,int b)
	{
		int c;
		c = a+b%2;
		return c;
	}
	static double average(double a,double b,double c)
	{
		double d;
		d = a+b+c%2;
		return d;
	}
	
  public static void main(String[] args) {
  System.out.println(average(25,50));
  System.out.println(average(15.8,50.8,15.9));
 
	}

}
