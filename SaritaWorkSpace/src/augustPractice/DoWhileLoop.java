package augustPractice;
import java.util.Scanner;
public class DoWhileLoop {
	public static void Tableprint(int table) {
		for(int a=1;a<=10;a++) {
			System.out.println(table+"x"+a+"="+table*a);
		}
	}

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		int table;
		System.out.println("please enter a number to print a table");
table=scr.nextInt();
Tableprint(3);
	}

}
