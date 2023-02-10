import java.util.Iterator;

public class PracticeProgram {

	public static void main(String[] args) {
		nextWord();
		
		//swapping with 2
int a=10,b=20;
a=a+b;
b=a-b;
a=a-b;
System.out.println("a= "+a);
System.out.println("b= "+b);
//swapping with 3
String ab="janvi",ba="vedu",sam;
sam=ab;
ab=ba;
ba=sam;
System.out.println("ab= "+ab);
System.out.println("ba= "+ba);

//fabnnoci series
int c=0,d=1,e;
for(int i =0;i<=5;i++) {
	e=c+d;
	c=d;
	d=e;
	System.out.print("e= "+e+" ");
}System.out.println();
//word reverse
String name="nature";
for (int i =name.length()-1;i>=0; i--) {
	char n=name.charAt(i);
	System.out.print(n);
}System.out.println();
//sentence reverse
 String same="old is gold";
String []p= same.split(" ");
for (int i = 0; i < p.length; i++) {
	char []u=p[i].toCharArray();
	for(int j=p[i].length()-1;j>=0;j--) {
		System.out.print(u[j]);
	}System.out.print(" ");
}System.out.println();
	//
String str="india is great".toLowerCase();
for(char sa='a';sa<='z';sa++) {
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(sa==str.charAt(i)) {
			count ++;
		}
	}if(count>0) {
		System.out.println(sa+":"+count);
	}
}System.out.println();
	}
	//next word
	
public static void nextWord() {
	String next="vedashree";
char ch[] = next.toCharArray();
for (int i = 0; i < next.length(); i++) {
	System.out.print(++ch[i]); 
}System.out.println();




}

}	



