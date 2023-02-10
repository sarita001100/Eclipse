import java.util.Iterator;

public class ReverseProgram {

	   public static void main(String[]args) {
		
//		   String a="sarita";
//		      for (int i = 0; i <a.length(); i=i+2) {
//			char b=	a.charAt(i);
//			System.out.print(b);
//		      }
//		      System.out.println();
//		      String sa="sarita";
//		      for (int i = 0; i <a.length(); i++) {
//			char b=	a.charAt(i);
//			System.out.print(i);
//		      }
		    String word="Hey I Am Sarita";
		     String [] a= word.split(" ");
		     for(int i=0; i<a.length; i++) {
		    	 for(int j= a[i].length()-1; j>=0; j--) {
		    		char c[]= a[i].toCharArray();
		    		 System.out.print(c[j]); 
		    	 }
		    	 System.out.print(" ");
		     }System.out.println();
	
	String world ="World is Beautiful";
	String []b=world.split(" ");
	for (int i = 0; i < b.length; i++) {
		char c[]	=b[i].toCharArray();
     for(int j=b[i].length()-1;j>=0;j--) {
		System.out.print(c[j]);		}System.out.print(" ");
	}System.out.println();
	
	String arr[]= {"i","am","king","i","am","everything"};
for (int i = 0; i < arr.length; i++) {
 for (int j = i+1; j < arr.length; j++) {
if(arr[i]==arr[j]) {
	System.out.print(arr[j]);
} }
}System.out.println();


String abc="sarita";
for (int i = abc.length()-1; i >=0; i--) {
char ha=	abc.charAt(i);
System.out.print(ha);
}System.out.println();

String sa="here is a beatiful flower";
String []re=sa.split(" ");
for (int i = 0; i < re.length; i++) {
char []	ga=re[i].toCharArray();
for (int j = re[i].length()-1; j >=0; j--) {
	System.out.print(ga[j]);
}System.out.print(" ");
}System.out.println();

int r=12,s=22;
r=r+s;
s=r-s;
r=r-s;
System.out.println(s);
System.out.println(r);

int p=22,q=33,t = 0;
t=p;
p=q;
q=t;
System.out.println(p);
System.out.println(q);

int l=0,m=1,n;
for (int i = 0; i <5; i++) {
	n=l+m;
	l=m;
	m=n;
	System.out.print(n+" ");
	}System.out.println();

String k="naman",xt=" ";
String real=k;
for(int i=k.length()-1;i>=0;i--) {
xt=xt+k.charAt(i);
}if(real.equals(k)){
	System.out.println("palindrom");
}else {
	System.err.println("not a palindrome");
}



	   }}
