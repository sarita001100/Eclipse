import java.util.Scanner;

public class PracticeAll {

	public static void main(String[] args) {
Scanner scr= new Scanner(System.in);
String str=" ";
do {
System.out.println("enter the year");
int year=scr.nextInt();
if((year%400==0)||(year%4==0 &&year%100!=0)) {
	System.out.println("This Is Leap Year");
}else {
	System.out.println("This Is Not Leap Year");
}System.out.println("do you enter other  year...");
str= scr.next();

}while(str.contains("yes"));
System.out.println("Thank you");
//palindrome
//	String str="sarita", st="";
//	String orginal=str;
//	for(int i=str.length()-1;i>=0;i--) {
//		st=st+str.charAt(i);
//	}System.out.println(st);
//		if(st.equals(orginal)) {
//			System.out.println("it is palindrome");
//		}else {
//			System.out.println("not a palindrome");
//		}
//	//reverse sentence
//		String sam ="Old Is Gold";
//	String []sa=	sam.split(" ");
//		for(int i=0;i<sa.length;i++) {
//	char sal []= sa[i].toCharArray();
//	for(int j=sa[i].length()-1;j>=0;j--) {
//		System.out.print(sal[j]);
//	}System.out.print(" ");
//		}System.out.println();
//		
//	//vowels count
//		String jan="Water is life".toLowerCase();
//		for(char ch='a';ch<='z';ch++) {
//			int count=0;
//			for(int i=0;i<jan.length();i++) {
//				if(ch==jan.charAt(i)) {
//					count++;
//				}
//				}if(count>0) {
//					System.out.println(ch+":"+count);
//				}
//		}System.out.println();
//		
//	String 	trs="sarita";	
//  char ch[]= trs.toCharArray();
//	for(int i=0;i<trs.length();i++) {
//		System.out.print(++ch[i]);
//	}System.out.println();
//		
//		
//		
		
		
		
		
		
		
		
	}

}
