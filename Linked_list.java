
                package javaproject;
		import java.util.LinkedList;

		public class Linked_list {

			public static void main(String[] args) {
				// array list
				LinkedList<Integer> obj= new LinkedList<Integer>();
				
				//add elements to linkedlist
				obj.add(1);
				obj.add(2);
				obj.add(3);
				obj.add(4);
				System.out.println(obj); //returns arraylist(dynamic)
				
				//same as array list, difference is addfirst,addlast,removefirst,removelast
				//addfirst,adddlast
				obj.addFirst(7);
				obj.addLast(8);
				System.out.println(obj);
				
				//remove first,remove last
				obj.addFirst(7);
				obj.addLast(8);
				System.out.println(obj);
				obj.removeFirst();
				obj.removeLast();
				System.out.println(obj);
			
				//getfirst and getlast
				
				System.out.println(obj.getFirst());
				System.out.println(obj.getLast());
				
				//add element by mentioning index
				
				obj.add(2, 10);
				System.out.println(obj);
				
				
				//array
				int[] array= {1,2,3,4};
				System.out.println(array); // returns memory address(static)
				
				//get an element(display)
				
				System.out.println(obj.get(1));
				
		        
				//update an element
				obj.set(0, 5);
				System.out.println(obj);
				
				//remove an element
				
				obj.remove(0);
				System.out.println(obj);
				
				//delete all elements
				obj.clear();
				System.out.println(obj);
				
				//size 
				
				System.out.println(obj.size());
				System.out.println(obj.isEmpty()); 
				
				
				//additional methods (contains)
				
				obj.add(5);
				obj.add(6);
				obj.add(7);
				obj.add(8);
				obj.add(9);
				obj.add(9);
				
				System.out.println(obj.size());
				System.out.println(obj);
				System.out.println(obj.contains(4));  // true contain 4 in arralist
				System.out.println(obj.contains(11)); //false there is no 11 in arraylist
				
				System.out.println(obj.isEmpty());  //false ,arraylist contains elements
				System.out.println(obj.indexOf(9));  //returns 4 (duplicate or occurance)
				System.out.println(obj.lastIndexOf(9)); //returns 5 (duplicate from last)
				System.out.println(obj.indexOf(6));   //returns 1(no duplicate)
				System.out.println(obj.indexOf(2));  //returns -1 (no such element as 2 in arralist)
				
				//lamda expression
				
				System.out.println(obj);
				obj.removeIf(e-> e>7); // remove if arrayelements greater than 7 (e is variable, wecan use any variable)
				System.out.println(obj);
				
				
		        //addAll
				LinkedList<Integer> obj1= new LinkedList<Integer>();
				obj1.addAll( obj); //all elements in obj gets added into obj1 
				System.out.println(obj1);
				
			}

	           }


