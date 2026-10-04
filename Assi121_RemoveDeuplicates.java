package javaAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//WAP to remove all duplicates in the given Collection 
public class Assi121_RemoveDeuplicates {

	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(50);
		System.out.println("The list is " + l1);
		
		Set<Integer> s1 = new HashSet<Integer>(l1);
		System.out.println("after removing duplicates The set is " + s1);
	}

}
