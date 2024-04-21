package javaproject;
import java.util.Scanner;
enum Token{
	RED,
	GREEN,
	BLUE
}
public class enum1 {
	public static void main(String[] args) {
		   Scanner sc =new Scanner(System.in);
		   boolean isvalidinput=true;
		   System.out.println("please enter the token:");
		   String input= sc.nextLine();
		   Token token = null;
           try {
               token = Token.valueOf(input); 
           } catch (IllegalArgumentException e) {
               System.out.println("Invalid token,Enter valid token");       
           }
           // If the token is valid, print it, else print invalid token
           if (token != null) {
               System.out.println("Valid token: " + token);
           } 
//           else {
//               System.out.println("Invalid token");
//           }
//			  
        // Ask the user if they want to continue
           while(isvalidinput) {
           System.out.print("Do you want to continue? (yes/no): ");
           String choice = sc.nextLine();
			   if(choice.equals("YES")){
				   System.out.println("Enter valid token"); 
				   String input1= sc.nextLine();
				   token = Token.valueOf(input1);
				   System.out.println("TOKEN MATCHES");  
			   }
			   else {
				
				   System.out.println("completed");
		         }
           }
	}
}
			   



