package Basics;

interface rideable  //cannot created method like abstract.but by using by default it can achieve. after 1.8 version
{
	int mac_speed=5; //all variable declaration is consider as final data type by default.
	//instance variable cannot allowed in interface.
	 void ride(); //by default it is public-abstract method
	 
	  default void display()
	 {
		 System.out.println("Displaying for testing....");
	 }
}

class car implements rideable   //in interface it can have multiple inheritance to extend
{
	public void ride()
	{
		System.out.println("Driving a car...");
	}
	 public void display()
	 {
		 System.out.println("Displaying for car  testing....");
		 // here we have done method over-riding so display  content over-ride from base class.
	 }
}
class bike implements rideable
{
	public void ride()
	{
		System.out.println("Driving a bike...");
		}
}
	class mechanic
	{
		void checking(rideable r)
		{
			System.out.println("Checking the vehicle...");
			r.ride();
		}
	}



public class Interface {

	public static void main(String[] args) {
	rideable r=new car();
	mechanic m=new mechanic();
	car c=new car();
	bike b=new bike();
    m.checking(b);
    m.checking(c);
    r.display(); //object created by using the base class.
    b.display();
    
	}

}
