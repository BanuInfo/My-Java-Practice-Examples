import java.io.*;
import java.util.*;
public class array1
{
	public static void main(String[] args)
	{
		int[] arr={100,200,300,400,500,600,700,800,900,1000};
		int sum=0;
		double average;
		System.out.println("sum of array is ");
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		
			System.out.println("Sum =" +sum);
			System.out.println("average of element is ");
			average= (sum/arr.length);
			System.out.println("average= " +average);
	}
}
		