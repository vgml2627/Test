package Basics;
abstract class shapes
{
	int square;
	int lenght;
	int height;
	abstract void area();
	
	//constructor for square
	shapes(int s)
	{
		square=s;
	}
	//constructor for triangle
	shapes(int l,int h)
	{
		lenght=l;
		height=h;
	}
	//method created for square
	int getsquare()
	{
		return square*square;
	}
}

class square extends shapes
{
	
    square(int s) {
		super(s);
		
	}

	void area()
	{
		//int t = square*square;
		//System.out.println("The square values is getting processed...."+t);//normal way of declaring value.
		System.out.println("The square values is getting processed...."+super.getsquare());//method invoking(over-riding)
	}
	
}

class triangle extends shapes
{
	
	
	triangle(int l, int h) {
		super(l, h);
		
	}
	int e=lenght*height*1/2;
	@Override
	void area() {
		System.out.println("The Triangle values is getting processed...."+e);
}
	
}


public class abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     square s1=new square(6);
     s1.area();
     triangle t1=new triangle(8,8);
     t1.area();
     
	}

}
