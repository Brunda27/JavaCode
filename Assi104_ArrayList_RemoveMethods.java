package javaAssignments;

import java.util.ArrayList;
//WAP to Demonstrate All Remove Methods in ArrayLis
public class Assi104_ArrayList_RemoveMethods 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a11 = new ArrayList<Integer>();
		a11.add(24);
		a11.add(34);
		a11.add(44);
		a11.add(54);
		a11.add(64);
		
		ArrayList<Integer> a22 = new ArrayList<Integer>();
		a22.add(3);
		a22.add(33);
		a22.add(43);
		a22.add(53);
		a22.add(63);		
		
		a11.remove(1);
		System.out.println("after removing the value at index 1 arraylist a11 becomes " +a11);
		
		
		a11.addAll(a22);
		System.out.println("After adding arraylist a22 to arraylist a11 ,arraylist a11 is " + a11);
		
		a11.removeAll(a22);
		System.out.println("After removing arraylist a22 to arraylist a11 ,arraylist a11 is " + a11);


	}

}
