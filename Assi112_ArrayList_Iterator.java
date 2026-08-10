package javaAssignments;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to check the given string is a part of the collection((ArrayList) using iterator
public class Assi112_ArrayList_Iterator {

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
			if(itr.next().equals("Harry"))
			{
				System.out.println("Harry is a part of the collection");
			}
		}
			
	}

}
