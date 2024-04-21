package javaproject;

public class Condition {
	
	public static void main(String[] args) {
		
            //if statement
		int age=4;
		if(age>18) {
			System.out.println("you are eligible to vote");  
		}
		else {
			System.out.println("you are not eligible to vote");
		}

		if(age%2==0) {
			System.out.println("even no");
	        
		}
		else {
			System.out.println("odd number");
		}
		
		
               //nested if
		int mark=95;
		if(mark>=35)
		{
			if(mark>=90)
			{
			 System.out.println("leader");
			}
		}
			System.out.println("bye");
	      
                 //nested if
			int total=249;
			if(total>250) 
			{
				if(total>450) 
				{
				System.out.println("leader");
				}
				else 
				{
					System.out.println("not a leader");
			        	
				}
			 }
				else
				{
					System.out.println("sorry you are not eligible ");
			        
				}
			System.out.println("bye");
	        
			}
	
	}


