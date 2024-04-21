package javaproject;

public class TYPE_CASTING {

	public static void main(String[] args) {
		// TYPE CASTING //widening casting ,small to big data
		int intValue = 10;
		double doubleValue = intValue; // Implicit casting from int to double
		System.out.println(doubleValue); // Output: 10.0

		// TYPE CASTING //narrowing casting ,small to big data
		
		double double2 = 10.5;
		int integer = (int) double2; // Explicit casting from double to int
		System.out.println(integer); // Output: 10
		
	}

}
