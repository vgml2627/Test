package Basics;

public class box {
	int lenght;
	int breadth;
	int width;
	
	box(int l,int b,int w) //constructor
	{
		 lenght=l;
		 breadth=b;
		 width=w;
	}
	
	int square() 
	{
		return lenght+breadth+width;
		
	}
	public static void main(String[] args) {
		
		box black=new box(10,15,20);
		System.out.println("constructor is:"+black.square());
	}
	

}

//like method overloading we can process constructor overloading.
