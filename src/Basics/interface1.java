package Basics;

import java.util.Scanner;

//interface cannot have constructor
interface producable
{
	void Car_Test();
	default void Salary_bonus()
	{
		
		System.out.println("special salary will be transfered later for employee");
	}
	
}

class senior_technician implements producable
{
@Override
public void Car_Test() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of senior Technician");
	String name=sc.nextLine();
	System.out.println("Enter the name of senior Technician Salary");
	double salary=sc.nextDouble();
	System.out.println("hi dear employee...:"+name);
	System.out.println("your salary is fixed to...:"+salary);
	}
public void Salary_bonus()
{
	
	System.out.println("special salary will be transfered later for employee...");
}
}


class Junior_mechanic implements producable
{
@Override
	public void Car_Test() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of junior_Mechanic");
	String name=sc.nextLine();
	System.out.println("Enter the name of junior_Mechanic Salary");
	double salary=sc.nextDouble();
	System.out.println("hi dear employee:"+name);
	System.out.println("your salary is fixed to..."+salary);
	if(salary>=12500)
	{
		salary=salary+15000;
		System.out.println("Salary credited with bonus..."+salary);
	}
	else
	{
		System.out.println("Salary credited with bonus is Nill...");
	}
	
}
}
class company
{
	void check(producable c)
	{
		System.out.println("Outcome is processed successfully...");
		c.Car_Test();
	}
}

public class interface1 {

	public static void main(String[] args) {
	    senior_technician s1=new senior_technician();
		Junior_mechanic j1=new Junior_mechanic();
		company c=new company();
		c.check(j1);
		c.check(s1);
		s1.Salary_bonus();
		
		
		

	}

}
