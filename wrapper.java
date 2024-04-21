package javaproject;

public class wrapper {

	public static void main(String[] args) {
	//inbuilt methods/wrapper class	
    	int n=18;
	//n. will not give any suggestion(primitive datattype dont have inbuilt method)
        Integer n1=new Integer(15);
	//n1. showing suggetion(bcoz wrapper class has inbuilt method)
		 
 	//compareto(comparing integer)
        System.out.println(n1.compareTo(15)); //equal  0
       System.out.println(n1.compareTo(14));  //less <0(1)
       System.out.println(n1.compareTo(18));  //greater >0(-1)    
       
       //compare unsigned(it will change into signed, changes sign and compare)
       //compare without sign means we can use this
       System.out.println(n1.compareUnsigned(15,-15)); 
       System.out.println(n1.compareUnsigned(-15,-15));
       System.out.println(n1.compareUnsigned(-15,15));
       System.out.println(n1.compareUnsigned(15,-19));
       
       
       //typecasting in wrapper, all types are converted to integer alone
       
       
       //string to Integer
       System.out.println(Integer.valueOf("10")+5); //15
       System.out.println("10"+5);                   //string +int 105
       
       
       //string to int (primitive type)
       
       System.out.println(Integer.parseInt("10")+5);  
       
       //Integer(n1) to float value,double,int
       System.out.println(n1.floatValue()); 
       
       System.out.println(n1.doubleValue()); 
       System.out.println(n1.intValue()); 
       
       
       //character
       
       Character c1= new Character('A');
       //compare to
       System.out.println(c1.compareTo('B'));  //-1 //CHECK ASCII VALUE
       
       
       //isalphabetic
       System.out.println(c1.isAlphabetic('a')); //true
       System.out.println(c1.isAlphabetic(1));   //false
       System.out.println(c1.isAlphabetic(' ')); //false
       System.out.println(c1.isAlphabetic('6'));   //false
       
       //isletter or digit
       System.out.println(c1.isLetterOrDigit('6')); //accept letter and digit
       
       //iswhitespace
       System.out.println(c1.isWhitespace(' ')); //true
       
       //islowercase
       System.out.println(c1.isLowerCase('a')); //true
       
       //isupppercase
       System.out.println(c1.isUpperCase('X')); //TRUE
       
       //range of integer
       System.out.println(Integer.MIN_VALUE);
       System.out.println(Integer.MAX_VALUE);
       
	}

}
