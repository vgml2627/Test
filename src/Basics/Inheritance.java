package Basics;

class Employee { //base class ,super class,parent class
	private String name; //instance variable
	//after changing to protected type the variable can access in derived class also.if it is private it can't accessed.
	private double salary; //instance variable
    //changing to private so there will be restriction in derived class in accessing the values.
//constructor
 Employee(String n,double s)
{
	 name=n;
	 salary=s;
}
/* Employee()
 {
	 name=" ";
	 salary=0.0;
 }*/
 public String getName(){
	return name;
 }
public void setName(String n){
	  name=n;
 }
 public double getSalary(){ // after changing instance variable to private all method change to public type.
	  return salary;
  }
 
public void setSalary(double s){
	 salary=s;
 }
public void raiseSalary(double percent){
	 salary+=salary*percent/100;
 }
}

class Manager extends Employee //derived class ,sub class,child class
{
double bonus;
Manager(String n,double s,double b)
{
     //name=n;
	//salary=s; // here error occurs because we have made instance variable declaration to private.So that derived class cannot access based class variable;
	super(n,s); //after adding this line it will allow to access the base class variable "Super"
	//Also dummy created constructor also wont required now.
	bonus=b;
}
public void setbonus(double b)
{
	bonus=b;
}
public double getSalary()
{
	return super.getSalary()+bonus; //from base class to invoke get-salary() we need to use command like super." "
    //method overriding :already a method present in based class now we are using same method in the derived class.
	
}
}

public class Inheritance {
 
	public static void main(String[] args) {
		Employee e1=new Employee("vishnu",25000);
		e1.raiseSalary(25);
        System.out.println(e1.getName()+" "+" salary is:"+e1.getSalary());
        Manager m1=new Manager("geethan", 65000,0);
        m1.setbonus(10000);
        System.out.println(m1.getSalary());
	}

}

//Access Specifier Types: public,private and protected.
//Access Specifier: protected is specially been used for inheritance concept.
