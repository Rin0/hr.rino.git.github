package hr.doma.file;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
 
	public static void main(String[] args) {

		try {
			File file = new File("c:\\fer\\newjavafile.txt");
 
			if (file.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
