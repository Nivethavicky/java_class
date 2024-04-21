package javaproject;

public class Function {
	
	//method to print something
	
	static void display() {
		System.out.println("you are inside the function display");
	}
	
//	method to add num
	public  static int add(int a,int b) {
		return a+b;
		
	}
	

	public static void main(String[] args) {
		Function obj=new Function();
	    display();
	    System.out.println(obj.add(5, 5));
	    

	}

}
