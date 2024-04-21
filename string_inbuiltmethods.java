package javaproject;

public class string_inbuiltmethods {

	public static void main(String[] args) {
		String s="Hello java";
		System.out.println(s.charAt(6));  //j
		System.out.println(s.charAt(5)); //space (we can't display space alone)
		System.out.println(s);  //Hello java
		System.out.println(s.contains("a")); //true
		System.out.println(s.contains("ava")); //true
		System.out.println(s.contains("p")); //false
		System.out.println(s.contentEquals("hello java")); //false
		System.out.println(s.contentEquals("Hello java"));  //TRUE
		System.out.println(s.equals("hello java")); //false
		System.out.println(s.equals("Hello java")); //TRUE
		System.out.println(s.equals("java"));  //false
		System.out.println(s.startsWith("hel")); //false(capital-H)
		System.out.println(s.endsWith("ava"));  //TRUE
		String s1="Hello java ";
		System.out.println(s1.endsWith(" "));   //TRUE(ENDSWITH SPACE)
		System.out.println(s.indexOf("ava"));  //7
		System.out.println(s.indexOf("a"));  //7 (first a)
		
		String s2="welcome to the programming world";
		System.out.println(s2.lastIndexOf("e",6));  //6
		System.out.println(s2.lastIndexOf("e"));  //13
		System.out.println(s.lastIndexOf("a"));  //9
		System.out.println(s.lastIndexOf("8"));  //-1
		
		
		//string to array- split method
		
		String s3="welcome to the programming world";
		System.out.println(s3.split(" ")); //memory address
		String[] str=s3.split(" ");
		for(String a:str) {
			System.out.println(a);
		}
		
		
	
		String[] str1=s.split("");
		for(String a:str1) {
			System.out.println(a);
		}
		
		String[] str2=s.split("a");
		for(String a:str2) {
			System.out.println(a);
		}
		
		//copyValueOf
		
		//character array to string
		
		char[] ch= {'a','p','p','l','e'};
		System.out.println(s.copyValueOf(ch)); //apple
		System.out.println(s);
		System.out.println(s.repeat(2)); //2 times
		
		
		//isblank, isempty
		String s4=" ";
		System.out.println(s4.isBlank()); //true
		System.out.println(s4.isEmpty()); //false (length:1)
		
		System.out.println(s.replace("java", "backend")); //hello backend
		System.out.println(s.substring(0, 9));  //Hello jav
		System.out.println(s.substring(4));
		//trim()
		String string=" heloo ";
		System.out.println(string.trim()); //trim space first and last
		
		//join (array to string)
		System.out.println(String.join("%",s3)); //not working
		System.out.println(String.join("%",str)); //joins only string of array
		//str ,we splited and it will be in array format,so works
	}

}
