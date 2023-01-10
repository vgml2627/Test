package Basics;



public class Method {
	
	static int addition(int a,int b)  //method definition
	{
	int sum;
	sum=a+b;
	System.out.println("Addition value" +sum);
	return sum;
		
		}
    static void TextMessage()
	{
		System.out.println("Welcome");
		return;
	}
    
    static  void TwoDigit(int a)
    {
    	if (a>=10)
    	{
    		System.out.println("True");
    	}
    	else
    	{
    		System.out.println("false");
    	}
    }

	public static void main(String[] args) {
		
//   argument or parameter passing
		addition(250,450);
		addition(75,45);
		addition(85,75);
		TextMessage();
		TwoDigit(15);
		TwoDigit(8);
	}

}
