package javaproject;

public class operator1 {

	public static void main(String[] args) {
//	arithmetic operator
		int a = 10;
		int b = 5;

		int sum = a + b; // Addition
		int difference = a - b; // Subtraction
		int product = a * b; // Multiplication
		int quotient = a / b; // Division
		int remainder = a % b; // Modulus (remainder)
 
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
        
System.out.println("';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");      
//        assignment operator
        int x = 10;
        x += 5; // Equivalent to: x = x + 5; //15
        x -= 3; // Equivalent to: x = x - 3;  //12
        x *= 2; // Equivalent to: x = x * 2;  //24
        x /= 4; // Equivalent to: x = x / 4;  //6
        x %= 3; // Equivalent to: x = x % 3;  //0
        
        System.out.println(x); //0
        
        
        
System.out.println("';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;"); 

//comparision operator

int num1 = 10;
int num2 = 5;

boolean isEqual = (num1 == num2); // Equal to       //false
boolean isNotEqual = (num1 != num2); // Not equal to  //true
boolean isGreaterThan = (num1 > num2); // Greater than   //true
boolean isLessThan = (num1 < num2); // Less than         //false
boolean isGreaterOrEqual = (num1 >= num2); // Greater than or equal to //true
boolean isLessOrEqual = (num1 <= num2); // Less than or equal to //false

System.out.println(isEqual);
System.out.println(isNotEqual);
System.out.println(isGreaterThan);
System.out.println(isLessThan);
System.out.println(isGreaterOrEqual);
System.out.println(isLessOrEqual);


System.out.println("';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;"); 

//logical  operator

boolean s = true;
boolean y = false;

boolean andResult = s && y; // Logical AND  //false
boolean orResult = s || y; // Logical OR    //true
boolean notResult = !s; // Logical NOT      //false


System.out.println(andResult );
System.out.println(orResult);
System.out.println(notResult);

        
System.out.println("';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;"); 

//bITWISE operator     

int num11 = 5; // Binary: 101
int num22 = 3; // Binary: 011

int andRes = num11 & num22; // Bitwise AND (result: 1)
int orRes = num11 | num22; // Bitwise OR (result: 7)
int xorResult = num11 ^ num22; // Bitwise XOR (result: 6)
int complementResult = ~num11; // Bitwise complement (result: -6)
int leftShiftResult = num11 << 1; // Left shift by 1 (result: 10) //5 LEFT SHIFTED BY 1
int rightShiftResult = num11 >> 1; // Right shift by 1 (result: 2)
//int zeroFillRightShiftResult = num11 >>> 1; // Zero-fill right shift by 1 (result: 2)
        
System.out.println(andRes);
System.out.println(orRes);
System.out.println(xorResult);
System.out.println(complementResult);
System.out.println(leftShiftResult);
System.out.println(rightShiftResult);  
//System.out.println(zeroFillRightShiftResult);  

//    TERNARY OPERATOR
System.out.println("';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;"); 


 int u= 10 > 5 ? 66 : 76;
 System.out.println(u);
 
        
	}

}
