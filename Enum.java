package javaproject;
import java.util.Scanner;

public class Enum {
	enum status{
		STARTED,
		INPROGRESS,
		COMPLETED
	}

	public static void main(String[] args) {
	   Enum obj =new Enum();
	   System.out.println(status.STARTED);
	   Scanner sc =new Scanner(System.in);
	   System.out.println("please enter your task update:");
	   String STATUS= sc.nextLine();
	   System.out.println(status.valueOf(STATUS));  //valueof change it into enum

	}

}
    