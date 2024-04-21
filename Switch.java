package javaproject;

public class Switch {

	public static void main(String[] args) 
	{
		int a=3;
		int b=4;
		int res=a*b;
		switch(res)
	       {
				
		case 1:
	        res=a+b;
	        break;
				
		case 2:
	        res=a-b;
	        break;
			       
		case 3 :
		res=a*b;
	        break;  
	        
		case 4:
	        res=a/b;
	        break;
			       
	        default:
	    	System.out.println("invalid");
		break;
	       }
	}
    }
