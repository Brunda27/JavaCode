package javaAssignments;
//WAP to demostrate the StringBuilder methods
//reverse,charAt,delete,insert,append,replace
public class Assi102_StringBuilderMethods {

	public static void main(String[] args) 
	{
		StringBuilder s2 = new StringBuilder("classroom");
		System.out.println(s2.charAt(5));
		s2.insert(9, " with students");
		System.out.println("After using insert method s2 is " + s2);
		s2.append(" is good");
		System.out.println("After using append method s2 is " + s2);
		s2.replace(10, 14, "without");
		System.out.println("After using replace method s2 is " + s2);
		s2.delete(s2.length()-7,s2.length());
		System.out.println("After using delete method s2 is " + s2);
		StringBuilder s3 = new StringBuilder("Bad");
		s3.reverse();
		System.out.println("After using reverse method s3 is " + s3);


		
	}

}
