package javaproject;
import java.util.HashSet;
import java.util.ArrayList;
public class Hash_set {

	public static void main(String[] args) {
	 //same like array list and linked list, difference is it wont accept duplicate value
		//get method not available
		//create hashset
		HashSet<Integer> obj=new HashSet<Integer>();
		
		
		//add items
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(1); //wont accept duplicate value
		System.out.println(obj);
		// System.out.println(obj[1]); this line will give errror that type is hashset , not array
		
		//so we need to convert it into arraylist to access single element
		
		ArrayList<Integer> li=new ArrayList<>(obj);
		System.out.println(li.get(0));
		
		//now if we are some elements into list (list accept duplicate value)
		
		
		
		
		//check item exists
		
		System.out.println(obj.contains(1));  //true
		
		//remove
		obj.remove(2);
		
		//obj.clear();	
		
		//obj size
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		//loop through hashset
		for(Integer i:obj) {
			System.out.println(i);    //it is used to take full hashset
			
			
	   //there is no get method, so we cant take singlr value here		
			
		}
		
		
	}

}
