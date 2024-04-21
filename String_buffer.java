package javaproject;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == checks the address, equals method  check content
		
		System.out.println("string literal");
		 //string literal
		String s  = "he";
		String s1 = "he";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s == s1);   //true
		System.out.println(s.equals(s1));   //true
		
		System.out.println("string literal and reference");
		
		//string literal and reference
     
		String str  = new String("he");
		String str1 = "he";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);   //false
		System.out.println(str.equals(str1));   //true
		
		
		String str2 = new String("he");
		String str3 = new String("he");
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2 == str3);   //false
		System.out.println(str2.equals(str3));   //true
		
		//Stringbuffer reference
		// equals method in string buffer checks memory address
                //here both reference are different
		StringBuffer sb= new StringBuffer("hello");
		StringBuffer sb1= new StringBuffer("hello");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb.equals(sb1));   //false
		
		//STRINGBUFFER ALLOW STRING ALTERATION
		//stringBuffer is mutable
		//stringBuffer create,delete,update is possible
		// string create, charAt(get char)..cant updat or delete
		sb.append("hi");
		sb.deleteCharAt(1); //delete char
		sb.setCharAt(1, 't'); //update
		
	        System.out.println(sb); //hellohi
		
		//check sb.append() it accpt many values like string ,char, boolean
		
		//string is immutable(cant change)
		//to update string
	    
	        //stringbuilder--thread safe(multiple work ...throw error)
	        //stringbuffer---not thread safe(preferrable, multiple works execute line by line)
		
		StringBuilder se=new StringBuilder("he");
		
	   }

        }
