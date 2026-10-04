package javaAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//WAP to Demonstration of Map Iteration Techniques 
public class Assi117_MapIteration {

	public static void main(String[] args)
	{
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(105,"Gujarat");
		m2.put(106,"Assam");
		m2.put(107,"Tamil nadu");
		m2.put(108,"Meghalaya");
		m2.put(109,"mizoram");
		System.out.println(m2);
		System.out.println("Iterating all keys using key set");
		for( Integer i1:m2.keySet())
		{
			System.out.println(i1);
		}
		System.out.println("Iterating all values using values");
		for(String s1:m2.values())
		{
			System.out.println(s1);
		}
		System.out.println("Iterating key-value pairs using entryset");
		for(Entry<Integer, String> s2: m2.entrySet())
		{
			System.out.println(s2);
		}
		Set<Entry<Integer ,String>> s5 = m2.entrySet();
		System.out.println("Itertaing key-values using iterator");
		Iterator<Entry<Integer ,String>> i3= s5.iterator();
		
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
	}

}
