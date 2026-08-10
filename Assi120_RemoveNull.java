package javaAssignments;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to remove all the NULL in the given collection
public class Assi120_RemoveNull {

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("Python");
		a1.add(null);
		a1.add("node js");
		a1.add(null);
		System.out.println("before removing numm arraylist a1 is " + a1);
		
		Iterator<String> i1 = a1.iterator();
		while(i1.hasNext())
		{
			if(i1.next()==null)
			{
				i1.remove();
			}
		}
		System.out.println("After removing null " + a1);
	}

}
