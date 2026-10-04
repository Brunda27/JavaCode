package javaAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//"WAP to Demonstrate Collection Methods: addAll(), clear(), contains(), containsAll(), 
//equals(), isEmpty(), iterator(), and remove() ,removeAll(), and size()."

public class Assi109_CollectionMethods {

	public static void main(String[] args) 
	{
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(200);
		c2.add(300);
		c2.add(400);
		c2.add(500);
		
		c1.addAll(c2);
		System.out.println("After adding collection c2 to c1 ,collection c1 becomes " + c1);
		System.out.println("does c1 contains 300 value " + c1.contains(300));
		System.out.println("does c1 contains c2 collection " + c1.containsAll(c2));
		System.out.println("does both the collections c1 and c2 are equal ? " + c1.equals(c2));
		c1.remove(20);
		System.out.println("After removing 20 from c1 collection ,c1 is "+ c1);
		c1.removeAll(c2);
		System.out.println("After removing c2 from c1 collection ,c1 is "+ c1);
		System.out.println("The size of collection c2 is " + c2.size());
		c1.clear();
		System.out.println("After clearing c1 collection is " + c1);
		System.out.println("is c1 collection is empty ? "+ c1.isEmpty());
		
		Iterator<Integer> itr = c2.iterator();
		System.out.println("forward iterator using iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
