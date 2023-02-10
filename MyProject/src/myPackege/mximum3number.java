package myPackege;

import java.util.Scanner;

public class mximum3number {
	public static void main(String[] args) {
		
	int a,b,c;
	Scanner in=new Scanner(System.in);
	
	System.out.println("enter a: ");
	a=in.nextInt();
	
	System.out.println("enter b: ");
	b=in.nextInt();
			
	System.out.println("enter c: ");
	c=in.nextInt();
	
	if (a > b && a > c) {
		System.out.println("a is big number");
	}
	else if(b > a && b > c) {
		System.out.println("b is big number");
	}
	else
		System.out.println(" c is big number");
		
	}
	}
	
	
	
	
	
	
	


