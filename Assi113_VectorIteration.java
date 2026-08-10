package javaAssignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

//WAP to Demonstrate the Vector Class Using Iterator, ListIterator, and Enumeration.
public class Assi113_VectorIteration {

	public static void main(String[] args) 
	{
		Vector<Character> v1 = new Vector<Character>();
		v1.add('A');
		v1.add('B');
		v1.add('C');
		v1.add('D');
		v1.add('E');
		
		Iterator<Character> itr = v1.iterator();
		System.out.println("Foward iteration using iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator<Character> itr1 = v1.listIterator();
		System.out.println("Foward iteration using listiterator");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("backword iteration using listiterator");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		Enumeration<Character> e1 = v1.elements();
		System.out.println("Foward iteration using Enumeration");
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
