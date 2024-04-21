package javaproject;
import java.io.File;
import java.io.IOException;

public class Create_file {

	public static void main(String[] args) {
		
    
     try {
    	 File obj= new File("filename1.txt");  //to create a file in specific directory
    	 
    	 if(obj.createNewFile()) {
    		 System.out.println("File created"+obj.getName());
    	 }
    	 else {
    		 System.out.println("File already exists");
    	 }
     }catch(IOException e) {
    	 System.out.println("an error occured");
    	 e.printStackTrace();
     }
	}

}
