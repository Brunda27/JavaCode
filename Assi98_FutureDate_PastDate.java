package javaAssignments;

import java.util.Date;

//WAP to print future data and past date with different formats
public class Assi98_FutureDate_PastDate 
{

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime()+ (1000*60*60*24*2));
		System.out.println("The future date 2 days from today is  "+ d2);
		Date d3 = new Date(d1.getTime() - (1000*60*60*24*2));
		System.out.println("The past date 2 days from today is  "+ d3);
		String s1 = d2.toString();
		System.out.println(s1);
		String day = s1.substring(0,4);
		String month =s1.substring(4,8);
		String date =s1.substring(8, 11);
		String year =s1.substring(s1.length()-4);
		String date_format = day+month+date+year;
		System.out.println("date format is " + date_format);
	}

}
