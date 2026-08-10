package javaAssignments;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to to Demonstrate Iterator and Its Methods in ArrayList
public class Assi106_Iterator {

	public static void main(String[] args) 
	{
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Harry");
		a2.add("Joshua");
		a2.add("Jack");
		a2.add("Rock");
		
		Iterator<String> itr = a2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
