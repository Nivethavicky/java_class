package javaproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class person implements Comparable<person> {
	private String name;
	private int rollno;
	
	//constructor
	
	person(String a, int b){
		this.name=a;
		this.rollno=b;
	}
	
//	right click identifer ,click source,generate geeter setter, select
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	
	//compareTO is used to compare and swap
	public int compareTo(person o) {
		return this.getRollno()- o.getRollno();
		//return 0;(wont sort)
	}	
	
}


public class scomparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating list(passing class name)instaed of datatype like INTEGER,STRING
		List<person> p= new ArrayList<>();
		//p.add("hello"); shows error
		
		p.add(new person("java",54));
		p.add(new person("java1",14));
		p.add(new person("java3",34));
		
		Collections.sort(p);
		System.out.println(p);
		for(person p1:p) {
			System.out.println(p1.getRollno());
		}
	}

}
