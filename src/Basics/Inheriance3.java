package Basics;

class School{
	 private String Name;
	 private int vehicle;
	 private double salary;
	
School(String n,int v,double s){
		Name=n;
		vehicle=v;
		salary=s;
}
/*School(){
	Name=" ";
	vehicle=0;
	salary=0.0;
}*/

public String getName(){
		return Name;
	}

public void setName(String n){
	Name=n;
	
}
public int getVehicle(){
	return vehicle;
}
public  void setVehicle(int v){
	 vehicle=v;
}
public double getSalary(){
	 return salary;
 }
 
public void setSalary(double s){
	salary=s;
}
public void setexperience(int i) {
	// TODO Auto-generated method stub
	
}

public void setbonus(int i) {
	// TODO Auto-generated method stub
	
}
}
class student extends School
{
	int van_capacity;
	student(String n,int v,double s,int c)
	{
		//Name=n;
		//vehicle=v;
		super(n,v,s);
	    van_capacity=c;
	}
	public void setVanCapacity(int c){
		van_capacity=c;	
	}
	@Override
	public int getVehicle() {
		return van_capacity/super.getVehicle();
		
	}
	}

class Teacher extends student
{
	double bonus;
	int exp;
	Teacher(String n,int v,double s,int c,int y,double b)
	{
		super(n,v,s,c);
		bonus=b;
		exp=y;
		
	}
	void setbonus(double b)
	{
		bonus=b;
	}
	public void setexperience(int y)
	{
		exp=y;
	}
	
	@Override
	public double getSalary() {
		
		bonus+=bonus/exp;
		return super.getSalary()+bonus;
	}
}



public class Inheriance3 {

	public static void main(String[] args) {
		School s1=new School("Brindisi", 5, 15000);
		System.out.println("The get school name is:"+" "+s1.getName());
		System.out.println("The get school salary is:"+" "+s1.getSalary());
		System.out.println("The get school vehicle is:"+" "+s1.getVehicle());
		
		student s2=new student("Don-Bosco",10, 25000,0);
		System.out.println("The school name is:"+" "+s2.getName());
		//System.out.println("The school vehicle is:"+" "+s2.getVehicle());
		System.out.println("The school salary is:"+" "+s2.getSalary());
		s2.setVanCapacity(150);
		
	    System.out.println("The school vehicle_density is:"+" "+s2.getVehicle());
	    
	    Teacher t1=new Teacher("veegee", 0, 0, 0, 5, 25000);
	    System.out.println("Then name of the Teacher is:"+t1.getName());
	    t1.setexperience(5);
	    t1.setbonus(10000);
	    System.out.println("Then name of the Teacher is:"+t1.getSalary());
	}

}
