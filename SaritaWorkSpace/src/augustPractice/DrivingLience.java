package augustPractice;
import java.util.Scanner;
public class DrivingLience{

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		String Y_N=" ";
				
		do {
			System.out.println("Please enter your age");
			int a= d.nextInt();
			 if(a>60)
				System.out.println(" You are Over age");
			
			 else if(a>=18)
				System.out.println("You are eligible for DL");
				
		else if (a<=18 ) {
			System.out.println("You are not eligible for DL");
		}
		
		 System.out.println("Do you want print anything? (Y_N )");
		 Y_N= d.next();
		} while (Y_N.contains("Y"));
		System.out.println("Thank You!");  
      
}}