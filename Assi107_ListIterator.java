package javaAssignments;

import java.util.ArrayList;
import java.util.ListIterator;

//WAP to to Demonstrate listIterator and Its Methods in ArrayList
public class Assi107_ListIterator 
{

	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Harry");
		a1.add("Joshua");
		a1.add("Jack");
		a1.add("Rock");
		
		ListIterator<String> i1 = a1.listIterator();
		System.out.println("foward iteraton using listiterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("backward iteraton using listiterator");

		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}

}
