package javaproject;

public class outer_class {
	int a=5;
	class Inner_class{  //if inner class is static
		int b=8;
	}

	public static void main(String[] args) {
		outer_class.Inner_class obj=new outer_class().new Inner_class();
		//if inner class is static
		//outer_class.Inner_class obj=new outer_class(). Inner_class();
		System.out.println(obj.b);

	}

}
