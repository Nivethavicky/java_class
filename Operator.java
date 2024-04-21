package javaproject;

public class Operator {

	public static void main(String[] args) {
		//post increment
		
	int n=5;
	System.out.println(n);
	System.out.println(n++);
        System.out.println(n);   //here n= 6
	        
        int val=n++;
        System.out.println(val); //6
        System.out.println(n);    //7
        
        
        System.out.println("'''''''''''''''''''''''''''''''");
        
        //pre increment
        System.out.println(n); //
        System.out.println(++n);  //8
        System.out.println(n);   //8
        
        int res=++n;
        System.out.println(res);  //9
        System.out.println(n);   //9
        
        
       // post decrement
        
       int m=10;
       System.out.println(m); //10
       System.out.println(m--); //10
       System.out.println(m);   //9
       
       int res1=m--;
       System.out.println(m);//8
       System.out.println(res1); //9

   }
}
