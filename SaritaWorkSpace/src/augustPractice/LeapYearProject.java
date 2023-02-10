package augustPractice;
import java.util.Scanner;
public class LeapYearProject {

	public static void main(String[] args) {
   Scanner abc=new Scanner(System.in);
   String yes_no="";
	
do {
	System.out.println("Please enter year");
	int a= abc.nextInt();
	if(a%4==0)
	System.out.println("this is a leap year");
	else
		System.out.println("This is not leap year");
	
	System.out.println("Do you want print another year");
	 yes_no =abc.next();
	
}while(yes_no.equalsIgnoreCase("yes"));
System.out.println("Thank you");
	}
	
}