package Basics;

public class typeConversion {

	public static void main(String[] args) {
		byte b=4;
		int n=10;
		 
		byte b1=7;
	    int n1=15;
	    
	    n=b; // Implicit type conversion. Also "int" size is more than the byte
		System.out.println("Implicit type conversion"+ n);
		
        b1=(byte) n1; /*error occur because the size in the left side is less than the int
		so we are doing explicit type conversion in temporary form*/
		System.out.print("Explicit type conversion"+ b1);
		
		 
	}

}
