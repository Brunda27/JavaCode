package javaAssignments;

import java.util.HashMap;
import java.util.Map;

//WAP to demonstrate Map interface methods replace(), size(), isEmpty() and clear()
public class Assi116_MapMethods2 {

	public static void main(String[] args) 
	{
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(100,"Kerala");
		m1.put(101,"Karnataka");
		m1.put(102,"Andhra");
		m1.put(103,"jammu");
		m1.put(104,"Rajasthan");
		System.out.println(m1);
		
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(105,"Gujarat");
		m2.put(106,"Assam");
		m2.put(107,"Tamil nadu");
		m2.put(108,"Meghalaya");
		m2.put(109,"mizoram");
		System.out.println(m2);
		
		m1.replace(100, "Telagana");
		System.out.println("after replacing value of 100 key m1 is " + m1);
		
		m1.replace(103, "jammu", "kashmir");
		System.out.println("after replacing value of 103 key m1 is " + m1);
		
		System.out.println("The size of map m2 is "+ m2.size());
		
		System.out.println("is m1 is empty? " + m1.isEmpty());
		m1.clear();
		System.out.println("is m1 is empty? " + m1.isEmpty());

		
	}

}
