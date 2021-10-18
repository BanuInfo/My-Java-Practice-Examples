import java.io.*;
import java.util.*;

public class array3
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9};
		int sum=0;
		int even=0;
		int odd=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%2==0)
			even=even+arr[i];
		    else 
			odd=odd+arr[i];
			
		}
		System.out.println("sum of array is "+sum);
		System.out.println("sum of even array is "+even);
		System.out.println("sum of odd array is "+odd);
	}
}
			
