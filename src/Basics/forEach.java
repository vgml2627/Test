package Basics;

public class forEach {

	public static void main(String[] args) {
		int arr[]= {5,8,9,1,2,3,6};
		int sum = 0;
		for(int x:arr)
		{
			System.out.println(x);
			sum+=x;
		}
		System.out.println("Total Sum value is:"+sum);

}
} 
