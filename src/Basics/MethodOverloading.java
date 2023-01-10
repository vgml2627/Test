package Basics;

public class MethodOverloading {

	static int max(int a)
	{
		return a;
	}
	static int max (int a,int b)
	{
		return a>b?a:b;
	}
	static  double max(double a,double b)
	{
		return a<b?a:b;
	}
	public static void main(String[] args) {
		System.out.println((5));
		System.out.println(max(8,9));
		System.out.println(max(9.5,15.9));
		

	}

}

//same method name but passing different parameters is called the method overloading.
//double data-type can accept the int value but int cannot accept the double value.
