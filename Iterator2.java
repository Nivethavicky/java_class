package javaproject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Iterator2 {

	public static void main(String[] args) {
		
    List<Integer> arr= new ArrayList<>();
    arr.add(15);
    arr.add(25);
    arr.add(35);
    System.out.println(arr);
    
    //for each,for loop
    
    Iterator<Integer> it= arr.iterator(); 
    while(it.hasNext()) {
    	 System.out.println("hello");
    	 System.out.println(it.next());
    	 
    }
    
    //STREAMS ->JAVA8  used to manipulate the array
    List<Integer> resultmap= arr.stream().map(e->e+5).collect(Collectors.toList());
    System.out.println(resultmap); //new araaylist with addded value
    System.out.println(arr); //original array not modified
    
    
    //filter(+,- cannot be used)
    
    List<Integer> filtermap= arr.stream().filter(e->e>15).collect(Collectors.toList());
    System.out.println(filtermap);
    
    //filter after map
    
    List<Integer> filtermap1= arr.stream().map(e->e+5).filter(e->e>30).collect(Collectors.toList());
    System.out.println(filtermap1);
    
    //reduce, to add all elements into one value,
    //
    
    Integer reducemap1= arr.stream().reduce(0,(a,b)->a+b);
    System.out.println(reducemap1);
    
    
    //total value plus four added
    Integer reducemap2= arr.stream().reduce(4,(a,b)->a+b);
    System.out.println(reducemap2);
    
    //anymatch(ANYONE MATHCHES) //return in boolean
    boolean anymatch= arr.stream().anyMatch(e->e>15);
    System.out.println(anymatch);
    
  //ALLmatch(ALL MATHCHES)
    boolean allmatch= arr.stream().allMatch(e->e>15);
    System.out.println(allmatch);
    
    //map duplicate value remove using distinct()
    List<Integer> resultmap1= arr.stream().map(e->e+5).distinct().collect(Collectors.toList());
    System.out.println(resultmap1);
    
    
    //filter duplicate value remove using distinct()
    
    //findfirst, findlast
    
//    Integer filtermap2= arr.stream().filter(e->e>0).findFirst(); //show error,bcoz filter is applied with condition
    //optional will accept empty value also
    Optional<Integer> filtermap2= arr.stream().filter(e->e>0).findFirst();
    System.out.println(filtermap2);
    
    //sort
    
    List<Integer> sortedmap =arr.stream().sorted().collect(Collectors.toList());
    
    System.out.println(sortedmap); //already sorted, change value for sorting
    
	}

}