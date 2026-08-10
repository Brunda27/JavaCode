package javaAssignments;

import java.util.ArrayList;

//WAP to call ArrayList methods
public class Assi103_ArrayListMethods
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
		
		a1.add("kevin");
		System.out.println("after using add method arraylist a1 is " + a1);
		a1.add(2, "shreyas");
		System.out.println("after using add method with index arraylist a1 is " + a1);

		 a1.addAll(a2);
		System.out.println("after using addAll method arraylist a1 is " + a1);
		a1.addAll(3,a2);
		System.out.println("after using addAll method with specfic index arraylist a1 is " + a1);
		
		System.out.println("are both the arraylists are equal ? " + a1.equals(a2));
		System.out.println("is arraylist a2 is empty " + a2.isEmpty());
		a2.clear();
		System.out.println("after using clear method arraylist a2 is" + a2);


		 
	}

}
