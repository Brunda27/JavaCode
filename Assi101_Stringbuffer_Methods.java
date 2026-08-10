package javaAssignments;
//WAP to demonstrate the StringBuffer methods
//append,insert,replace,delete,capacity,length
public class Assi101_Stringbuffer_Methods 
{
	public static void main(String[] args) 
	{
		//1.Append method : used to concat 2 or more strings
		StringBuffer s1 = new StringBuffer("Java");
		s1.append(" Automation");
		System.out.println("after using append method s1 is " + s1);
		//2.Insert Method :used to insert specified string at specified position inser(int,other data types)
		s1.insert(4, " and python");
		System.out.println("after using insert method s1 is " + s1);
		//3.Replace method :used to replace the string at spcific start index and end index 
		//: replace(start ind,end ind,replaced string)
		s1.replace(0, 4, "r");
		System.out.println("after using replace method s1 is " + s1);
		//4.Delete method : will delete from start index to end index
		s1.delete(0,6);
		System.out.println("after using delete method s1 is " + s1);
		//5.Capacity :gives the default capacity
		System.out.println("The capacity of stringbuffer s1 is " + s1.capacity());
		System.out.println("The length of stringbuffer s1 is " + s1.length());



		
	}

}
