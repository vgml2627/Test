package Basics;

class Library {
	String name;
	int age;  //all are instance variable
	int pages;
	double price;
	String color;
	String size;
	String alert;
	int date;
	

public static void main(String[] args) {
	
Library customername=new Library();
Library book=new Library();
Library card=new Library();
Library remainder=new Library();

customername.name= "vishnu";
customername.age=25;
book.name="elon musk";
book.pages=250;
book.price=250.65;
card.color="blue";
card.size="25mm";
remainder.alert="Expiry Error Message";
remainder.date=25/8/2022;


System.out.println("The new customer name is:"+ customername.name);
System.out.println("The new customer" +" " + customername.name +" " + "age is:"+ customername.age);
System.out.println("The new customer book purchased is:"+ book.name);
System.out.println("The new customer book purchased page contain is:"+ book.pages);
System.out.println("The new customer card color is:"+ card.color);
System.out.println("The new customer card size is:"+ card.size);
System.out.println("The new customer purchased book remaider:"+remainder.alert);
System.out.println("The new customer purchased book remaider date:"+remainder.date);

	}
}

