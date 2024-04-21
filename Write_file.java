package javaproject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {

	public static void main(String[] args) {
		try {
			FileWriter obj= new FileWriter("file1.txt");
			obj.write("writing in new file");
			obj.close();
			System.out.println("successfuly wrote to the file");
		}catch(IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}	

	}

}
