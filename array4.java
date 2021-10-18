import java.io.*;
import java.util.*;
public class array4
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		System.out.println("first largest element in array is "+arr[arr.length-1]);
	    System.out.println("second largest element in array is "+arr[arr.length-2]);

	}
}