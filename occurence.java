import java.io.*;
import java.util.*;
public class occurence
{
	public static void main(String[] args)
	{
        int[] arr={1,2,2,4,5,4,3,2,1,5,6,8,};
		int[] freq= new int[arr.length];
		for (int i=0; i<arr.length; i++)
		{
			int no = arr[i];
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(no==arr[j])
				{
					count++;
					freq[j]=-1;
				}
		    }
		    if (freq[i]!=-1)
			{
				freq[i]=count;
			}
			int countduplicate=0;
			for(int i=0; i<freq.length; i++);
			{
				if(freq[i]>1)
				{
					countduplicate++;
				}
			}
			System.out.println("occurence"+ countduplicate);
		}
	}
}
			
	
