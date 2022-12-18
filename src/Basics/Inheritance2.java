package Basics;

 class CarManufacturer
{
	private String Name ;
	private double Size;
    private  double salary;
   
   CarManufacturer (String n,double s ,double e)
 {
	 Name=n;
     salary=s;
     Size=e;
 }
 
 //Company_name
 public String getName(){
		 return Name;
	 }
 public void setName(String n)
  {
	Name=n;  
  }
 
 //company_salary
 public double getsalary(){
	 return salary;
 }
public  void setsalary(double s){
	salary=s;
	 }

//company_size
public double getSize(){
	 return Size;
}
public void setSize(double e){
	 Size=e;
}

}
//Inheritance Phase1
class CEO extends CarManufacturer
{
double capitalsize;
CEO(String n,double e,double s, double c)
 {
	 super(n, e,s);
	 capitalsize=c;
 }

public void setcapitalsize(double c)
{
	capitalsize=c;
}
 
 public double getSize(){
	 //int capitalsize=5000;
	 return super.getSize()+capitalsize;
 }

}

public class Inheritance2 {

	public static void main(String[] args) {
		CarManufacturer cm=new CarManufacturer("vishnu", 15000,25);
		System.out.println(cm.getName()+" "+cm.getsalary()+ " " +cm.getSize());
		CEO cm1=new CEO("geethan",15000,95,0);
		cm1.setcapitalsize(250);
	    System.out.println("CEO name is:"+" "+cm1.getName()+" "+cm1.getsalary()+" "+ cm1.getSize());
		
		
	}

}
