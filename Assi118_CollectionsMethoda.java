package javaAssignments;

import java.util.ArrayList;
import java.util.Collections;

//WAP to demonstrate Collections methods 

public class Assi118_CollectionsMethoda 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(20);
		System.out.println(a1);
		System.out.println("the maximum value in a1 is " + Collections.max(a1));
		System.out.println("the minimum value in a1 is " + Collections.min(a1));
		Collections.sort(a1);
		System.out.println("After sorting a1 is " + a1);
		Collections.reverse(a1);
		System.out.println("After reversing a1 is " + a1);
		Collections.frequency(a1, 20);
		System.out.println("The frequency of 20 value in a2 collection is " + Collections.frequency(a1, 20));
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(2);
		System.out.println(Collections.binarySearch(a2, 5));
		
	}
	
}
