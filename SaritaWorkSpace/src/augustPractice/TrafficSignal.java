package augustPractice;
import java.util.Scanner;
public class TrafficSignal {

	public static void main(String[] args) {
		String Y_N=" ";
  Scanner ad=new Scanner(System.in);
  
	do {  System.out.println("Enter signal of traffic light");
	  String a=ad.next();
	  
	  if(a.equals("Red")) {
	  System.out.println("Red signal on! You are not allowed to go");
	  }
	  else if(a.equals("Yellow")) {
		  System.out.println("Yellow signal on!you are get reddy to go");
	  }
	  else if(a.equals("Green")) {
		  System.out.println("Green signal on! now you can go");}
	  else {
		  System.out.println("You enter wrong symbol");
	  }
	 System.out.println("Do you want to try again");
	   Y_N=ad.next();
  }while(Y_N.contains("Y"));
	  System.out.println("Thank you");
   }	}
  
	


