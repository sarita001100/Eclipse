package augustPractice;
import java.util.Scanner;
public class DoWhile {
	
   public static void Tableprint(int table) {
			for(int a=1;a<=10;a++) {
				System.out.println(table+"x"+a+"="+table*a);
			}
		}

		public static void main(String[] args) {
			String Y_N=" ";

			Scanner scr =new Scanner(System.in);
			do {
				System.out.println("please enter a number to print a table");
				int table= scr.nextInt();
				Tableprint(table);
				System.out.println("do you want to another table?(Y_N)");
               Y_N=scr.next();
               
               
				int x=1;
			}while(Y_N.contains("Y"));
			System.out.println("Thankyou");
			int table;
			
	}

}
