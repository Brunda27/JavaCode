package javaAssignments;
//WAP to convert set to list 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assi123_Setto_List {

	public static void main(String[] args)
	{
		Set<String> s1 = new HashSet<String>();
		s1.add("java");
		s1.add("Python");
		s1.add("node js");
		
		List<String> l1 = new ArrayList<String>(s1);
		l1.add("c++");
		l1.add("c");
		System.out.println("after converting set to list l1 is " + l1);
		
	}

}
