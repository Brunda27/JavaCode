package javaAssignments;

import java.util.HashSet;
import java.util.Iterator;

//WAP to iterate HashSet using Iterator
public class Assi124_HashSet_Iteration 
{

	public static void main(String[] args)
	{
		HashSet<String> a1 = new HashSet<String>();
		a1.add("java");
		a1.add("Python");
		a1.add("good");
		a1.add("node js");
		a1.add("bad");
		
		Iterator<String> i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
	

}
