package javaAssignments;

import java.util.Date;

//WAP to find out the current time,past time and future time.
public class Assi97_DateClass1 {

	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		System.out.println("Current time is " + d1);
	
		Date d2 = new Date(d1.getTime() + (1000*60*60*24*1));//future time
		System.out.println("The future date 1 day from today is  "+ d2);
		
		Date d3 = new Date(d1.getTime() - (1000*60*60*24*2));//past time
		System.out.println("The past date 2 day from today is  "+ d3);
		
		
	}

}
