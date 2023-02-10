package July1To10Practice;
import java.util.Scanner;
import java.util.Iterator;
public class DoWhileLoop {
	public static void tableprint(int table) {
		// int i =1;
		for(int i=1;i<=10;i++)
		System.out.println( table+"x"+i+"="+table*i);
		
	}

	public static void main(String[] args) {
		int table;
		String Y_N=" ";
		Scanner scr = new Scanner (System.in);
	Scanner scr1=new Scanner(System.in);
		
do {
System.out.println("please enter a number to print a table");
	table =scr.nextInt();
	tableprint(table);
	System.out.println("Do you want to another table? (Y_N)");
	Y_N=scr1.nextLine();
}while(Y_N.contains("Y"));
System.out.println("Thank You !");
		

	}

}
