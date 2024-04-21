package javaproject;
import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		//create a haspmap object
      HashMap<String,String> name= new HashMap<String,String>();
      //hashmap is one of the collection of key value pairs
      //hashmap<key,value>
      
      
      //add keys and values 
     // name.put("firstname", "lastname");
      
      name.put("seetha", "lakshmi");  
      name.put("subbiah", "siva");
      name.put("nivetha", "siva");
      name.put("siva", "lakshmi");
      name.put("viki", "nivi");
      System.out.println(name);
      
      //access an item(access using key)
      name.get("siva");
      System.out.println(name.get("siva"));
      
      //value accept null,key should be unique
      
      name.put("null", "null");
      name.put("hi", "null");
      name.put("null", "hello"); //key should be unique
      
      System.out.println(name);
      
      //remove an item
      name.remove("nivetha"); 
      //System.out.println(name);
      
      //remove all items
      //name.clear(); 
      //System.out.println(name);
      
      
      //size of hashmap
      System.out.println(name.size());
      
      //entryset gives op in array  .
      
      System.out.println(name.entrySet());  //returns in array
      
      
      //keyset
      System.out.println(name.keySet());  //returns  keys in array
      
    //value
      System.out.println(name.values());  //returns  values in array
      
      
      
    //giving value  and retriveing key of that value
      
       name.entrySet().forEach(e->{   //lamda  without using for loop ,e can give each element in array
    	  if(null!= e.getValue() && e.getValue() =="lakshmi"){ 
    		  System.out.println(e.getKey()); 
    	  }
       });
      
      
      // entryset cant be used in normal for loop
       
       //contains(key value)
       
     

	}

}
