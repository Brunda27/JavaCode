package javaAssignments;

import java.util.HashMap;
import java.util.Map;

//WAP to demonstrate Map interface methods like put(), putAll(), equal() and containsKey()
public class Assi115_MapMethods1 {

	public static void main(String[] args)
	{
			Map<Integer,String> m1 = new HashMap<Integer,String>();
			m1.put(100,"Kerala");
			m1.put(101,"Karnataka");
			m1.put(102,"Andhra");
			m1.put(103,"jammu");
			m1.put(104,"Rajasthan");
			System.out.println(m1);
			
			Map<Integer,String> m2 = new HashMap<Integer,String>();
			m2.put(105,"Gujarat");
			m2.put(106,"Assam");
			m2.put(107,"Tamil nadu");
			m2.put(108,"Meghalaya");
			m2.put(109,"mizoram");
			System.out.println(m2);
			
			m1.putAll(m2);
			System.out.println("After adding map m2 to m1 ,now m1 is" + m1);
			
			boolean b1 = m1.equals(m2);
			System.out.println("are m1 and m2 equal ? " + b1);
			
			boolean b2 = m1.containsKey(102);
			System.out.println("does m1 contains key 102? "+ b2);
			
			boolean b3 = m2.containsValue("Assam");
			System.out.println("does m1 contains Value assam? "+ b3);

	}

}
