package javaproject;

public class Array {

	public static void main(String[] args)
	{
		int[] numbers = {10, 20, 30, 40, 50};
		int firstElement = numbers[0]; // Accessing the first element (10)
		int thirdElement = numbers[2]; // Accessing the third element (30)
		int arrayLength = numbers.length; // Length of the array (5)
		System.out.println(numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		System.out.println("..........................................");
		for (int i = 0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		System.out.println("..........................................");
		
            //FOR EACH LOOP
		for (int num : numbers) {
		    System.out.println(num);
		}
		
	}

}
