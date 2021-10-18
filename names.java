import java.io.*;
import java.util.*;
public class names
{
	public static void main(String[] args)
	{
		int a;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("How many times your want to print your name");
		a=sc.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+" "+name);
		}
	}
}
		