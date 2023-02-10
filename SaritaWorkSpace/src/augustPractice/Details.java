package augustPractice;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
    Scanner abc=new Scanner(System.in);	
	Scanner abc2=new Scanner(System.in);
	String	Y_N=" ";
	do
	{ System.out.println ("Please enter user name...");
	String a =abc.next();
	System.out.println("Please enter your age....");
    int b =abc.nextInt();
	
	System.out.println("Please enter your mobile number...");
	String c = abc.next(); 
	
	System.out.println("Please enter your city...");
	String d =abc.next();
	
	System.out.println("User name is....."+a);
	System.out.println("User age is...."+b);
	System.out.println("User mobile no. is..."+c);
	System.out.println("User city name is...."+d);
	
	System.out.println("Do you want print anything? (Y_N )");
	Y_N= abc2.next();
	}while (Y_N.contains("Y"));
	System.out.println("Thank You!");  
	
}}