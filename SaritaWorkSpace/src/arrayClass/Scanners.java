package arrayClass;

import java.util.Scanner;

public class Scanners {


	public static void main(String[] args) {
System.out.println("input name");
Scanner scr=new Scanner(System.in);
		String line= scr.nextLine();
int lenth=	line.length();
	System.out.println("size= "+lenth);
//String[] str=	line.split(line);
char [] str =line.toCharArray(); 
System.out.println(str);
int spl=0;
spl=lenth;
if(spl>=5) {
	for(int  i=str.length-1;i>=0;i--) {
		System.out.print(str[i]);
	}}
else {
	System.out.println("not a valid charactor");
}

	}
}
