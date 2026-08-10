package javaAssignments;

import java.util.Stack;
import java.util.Vector;

//WAP to demonstrate all 5 add methods in vector
public class Assi114_VectorAddMethods {

	public static void main(String[] args)
	{
		Vector<String> v1 = new Vector<String> ();
		v1.add("Good");
		v1.addElement("Bad");
		v1.add("Good1");
		v1.add("Good2");
		v1.add("Good3");
		v1.add("Good4");
		
		Vector<String> v2 = new Vector<String> ();
		v2.add("abstract methods");
		v2.addElement("static method");
		v2.add("Non static method");
		v2.add("methods");
		v2.add("functions");
		v2.add("Classes");
		
		
		v1.add(2, "Good5");
		System.out.println("After adding the string value at index 2 v1 is " + v1);
		v1.addAll(v2);
		System.out.println("After added v2 ,v1 is " + v1);
		v1.addAll(2, v2);
		System.out.println("After added v2 at index postion 2 ,v1 is " + v1);
	}

}
