package javaproject;
import java.io.File;

public class File_info {

	public static void main(String[] args) {
		// GET FILE INFORMATION
		
		File obj= new File("filename1.txt"); 
		if(obj.exists()) {
			System.out.println("FILE NAME:"+obj.getName());
			System.out.println("ABSOLUTE PATH:"+obj.getAbsolutePath());
			System.out.println("FILE SIZE IN BYTES:"+obj.length());
			System.out.println("READABLE:"+obj.canRead());
			System.out.println("WRITABLE:"+obj.canWrite());
		}
		else {
			System.out.println("the file does not exist.");
		}

	}

}
