package javaAssignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//WAP to Demonstrate Set Interface Methods
public class Assi111_SetInterface {

	public static void main(String[] args)
	{
		Set<Integer> l1 = new HashSet<Integer>();
		l1.add(22);
		l1.add(32);
		l1.add(42);//deosnot follows indexing
		l1.add(42);//does not allows duplicate
		l1.add(null);//allows single null
		l1.add(null);
		System.out.println(l1);
		
		Set<Integer> l2 = new HashSet<Integer>();
		l2.add(22);
		l2.add(32);
		l2.add(42);
		l2.add(42);
		l2.add(null);
		
		l1.addAll(l2);
		System.out.println("After adding collection l2 to l1 ,collection l1 becomes " + l1);
		System.out.println("does l1 contains 3 value " + l2.contains(3));
		System.out.println("does l1 contains l2 collection " + l1.containsAll(l2));
		System.out.println("does both the collections l1 and l2 are equal ? " + l1.equals(l2));
		l1.remove(0);
		System.out.println("After removing the value at index 0 from l1 collection ,l1 is "+ l1);
		l1.removeAll(l2);
		System.out.println("After removing l2 from l1 collection ,l1 is "+ l1);
		System.out.println("The size of collection l2 is " + l2.size());
		l1.clear();
		System.out.println("After clearing l1 collection is " + l1);
		System.out.println("is l1 collection is empty ? "+ l1.isEmpty());
		
		Iterator<Integer> itr = l2.iterator();
		System.out.println("forward iteraton using iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
