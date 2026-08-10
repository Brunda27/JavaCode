package javaAssignments;

import java.util.ArrayList;
import java.util.Collection;

//Upcasting Program
public class Assi108_Upcasting {

	public static void main(String[] args)
	{
		Collection<String> c1 = new ArrayList<String>();//this is upcasting
		//converting the object of child class into super class type
		c1.add("Bomen");
		c1.add("good");
		c1.add("bad");
		c1.add("days");
		System.out.println(c1);
		
		
	}

}
