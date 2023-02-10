package arrayClass;

import java.util.Scanner;

public class ClassCalculator {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the first number");

double a= sc.nextDouble();
String c= sc.next();
double b= sc.nextDouble();
  switch(c) {
    case"+":
    	System.out.println(a+b);
    	break;
    	
    case"-":
      System.out.println(a-b); 
      break;
      
    case"/":
    	System.out.println(a/b);
    	break;
    	
    case "*":
    	System.out.println(a*b);
    	break;
    	
    	default:
    		System.out.println("invalid ");
      }
    	


}
}