package Basics;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File obj=new File("T:\\testdoc\\file.txt");
		try {
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Error occurred");
			e.printStackTrace();
			
		}

	}

}
