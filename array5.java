import java.io.*;
import java.util.*;
public class array5
{
	public static void main(String[] args)
	{
		String[] arr={"anu","banu","shangavi","niher","rishi","ziva","vimal","karthi","hema","resh"};
		String temp=null;
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("original array");
			System.out.print(arr[i]+"\t");
		}
		System.out.println("sorted names of array is ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length-1; j++)
			{
				if (arr[j-1] > 0)
				{	
			          temp = arr[j-1];
					  arr[j-1]=arr[j];
					  arr[j]=temp;
                }
			}
		}
	
	    for (int i=0;  i<arr.length; i++);
	    {
            System.out.print(arr[i] +"\t");
	    }
	}
}

	
				
			
		

	
