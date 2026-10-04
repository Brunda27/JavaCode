package javaAssignments;
//WAP to find out the avarage of all the values present in the array
public class Assi88_ArrayAverage {

	public static void main(String[] args) 
	{
		double d1[] = new double[4];
		d1[0] = 20;
		d1[1] = 30;
		d1[2] = 40;
		d1[3] = 50;
		double sum = 0;
		
		for(int i =0;i<d1.length;i++)
		{
			sum = sum+d1[i];
		}
        System.out.println("The sum of all the values present in the given array is---> "+ sum);
        double average = sum/d1.length ;
        System.out.println("The average of all the values present in the given array is---> "+ average);
	}

}
