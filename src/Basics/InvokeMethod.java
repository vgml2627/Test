package Basics;

public class InvokeMethod {

	int lenght;
	int breadth;
	int width;
	
	 int square() // Static is not used because we are call method using the object.
	{
		return lenght+breadth+width;
		
	}
	public static void main(String[] args) {
    InvokeMethod add=new InvokeMethod();
    add.lenght=10;
    add.breadth=25;
    add.width=8;
   
    System.out.println("The total value of square is:" +add.square()); // invoking method call a method by using the object created

	}

}
