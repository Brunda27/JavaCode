package javaAssignments;

import java.util.ArrayList;

//WAP to Demonstrate size(), get() and contains() Methods of ArrayList
public class Assi105_ArrayListMethod2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Aman");
		a1.add("Sanjay");
		a1.add("Ajay");
		a1.add("raj");
		System.out.println("before adding any methods arraylist a1 is " + a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Harry");
		a2.add("Joshua");
		a2.add("Jack");
		a2.add("Rock");
		System.out.println("before adding any methods arraylist a1 is " + a2);
		
		System.out.println("The size of arraylist a2 is  "+ a2.size());
		
		boolean b1 = a2.contains("Joshua");
		System.out.println("does a2 contains joshua " + b1);
		
		a1.addAll(a2);
		boolean b2 = a1.containsAll(a2);
		System.out.println("does a2 contains a1 " + b2);
		
		for(int i = 0;i<a2.size();i++)
		{
			String s1 = a1.get(i);
			System.out.println(s1);

		}
		

		
	}

}
