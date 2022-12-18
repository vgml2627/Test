package Basics;

class inner 
{
	int num;

	void innermethod()
	{
		System.out.println("Inner class");
	}
	static class outer  //if we give class as static then no need to invoke another object to access the inner class
	{
		int num;
		void outermethod()
		{
			System.out.println("outer class");
		}
	
}
}

public class InnerClass {

	public static void main(String[] args) {
		inner i=new inner();
		//i.num=15;
		i.innermethod();
		inner.outer o=new inner.outer(); //class is static so directly user inner class to call outer class.
		o.outermethod();
	}
 
}

//class file get created after compiling the program.
//In class file byte code will be generated/presented ,while running byte code goes as the input for JVM.

