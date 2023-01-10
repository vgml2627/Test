package Basics;

abstract class Member
{
	String name;
	abstract void WelcomeMessage();
}

class candidates extends Member
{
void WelcomeMessage() {
	System.out.println("Hello Student...");
}
}


class principal extends Member
{
	void WelcomeMessage() {
		System.out.println("Hello Teacher...");
	}
}

public class abstract1 {
	public static void main(String args[]) {
		
candidates s1=new candidates();
Member s2=new candidates(); //can create object but this way also.
s1.WelcomeMessage();
s2.WelcomeMessage();

principal p1=new principal();
p1.WelcomeMessage();

}
}

/* 1)for abstract class object  cannot get allocated because abstract is common class but can create object for 
extended class it will allow.   */