package Basics;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File obj=new File("filehandling.txt");
			if(obj.createNewFile())
			{
				System.out.println("file created successfully:..."+obj);
			}
			else
			{
				System.out.println("file created not  successfull:...");
			}
			
		} catch (Exception e) {
			System.out.println("file creation error occured:...");
			e.printStackTrace();
		}

	}

}
