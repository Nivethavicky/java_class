package javaproject;

public class Exception{
	
		    public static void main(String[] args) {
		        try 
		        {
		            // Code that may throw an exception
		            int result = 10/0;
		            System.out.println("Result: " + result);
		        } 
		        catch (ArithmeticException e) 
		        {
		            // Catching and handling the exception
		            System.out.println("An arithmetic exception occurred: " + e.getMessage());
		        } 
		        finally
		        {
		            // Code that always executes, regardless of whether an exception occurred or not
		            System.out.println("Finally block executed.");
		        }
		    }
		   
}

	
