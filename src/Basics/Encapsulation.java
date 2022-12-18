package Basics;

public class Encapsulation {
private String  company_name ;
private int company_estimated;
private int Employee_strenght;
private double salary;

Encapsulation(String n,int a,int s,double b)
{
	company_name=n;
	company_estimated=a;
	Employee_strenght=s;
	salary=b;
	
}

public void companyname(String n)
{
	System.out.print(n);
	return;
}

public int company_captial(int a, int s)
{
	int i;
	i=company_estimated+Employee_strenght;
	return i;
}

public double employee_salary(double b)
{
	return salary;
}


	
	public static void main(String[] args) {
    Encapsulation e1=new Encapsulation("Volvo",1000, 2000, 1000);
    System.out.println(e1.salary);
    System.out.println(e1.company_captial(0,0));
    System.out.print(e1.company_name);

	}

}


/*Encapsulation : binding of code and date.
 * act like black box and protects the date
 * public method act as interface to access the private date
 * enable us to write method without any parameter as data and code bounded.
 */
