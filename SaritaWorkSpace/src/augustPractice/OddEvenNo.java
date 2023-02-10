package augustPractice;
import java.util.Scanner;
public class OddEvenNo {

	public static void main(String[] args) {
		Scanner ab= new Scanner(System.in);
		String Yes_No=" ";
	
do {
	System.out.println("Please enter your digit");
	 int sc =ab.nextInt();

	if( sc %2==1)
		System.out.println("This is a odd number");
	else
		System.out.println("This is a even number");
	
	System.out.println("Do you want print another number?(Yes_No");
	Yes_No = ab.next();
}while(Yes_No.equalsIgnoreCase("Yes"));
System.out.println("Thank you!");
	}

}
