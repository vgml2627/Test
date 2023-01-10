package Basics;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		File obj=new File("T:\\testdoc\\file.txt");
		try {
			FileWriter write=new FileWriter(obj); //here we can give file path or file object created...
			write.write("hi welcome to the filehandling session");
			write.flush();
			write.close();
			
			} catch (Exception e) {
				System.out.println("Error occurred");
				e.printStackTrace();
			
		}

	}

}
