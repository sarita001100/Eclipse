package globlework;
import java.util.Scanner;
import java.util.Arrays;

public class mySecondClass {

	public static void main(String[] args, Scanner r) {

		int a[]=new int[5];
		System.out.print("Enter Data in Array");

		for(int i=0;i<a.length;i++)
		{
		a[i]=r.nextInt();
		}

		Arrays.sort(a);

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
