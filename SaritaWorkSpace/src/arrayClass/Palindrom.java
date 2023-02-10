package arrayClass;

public class Palindrom {

	public static void main(String[] args) {
String a ="mam" ,name= "";

//char []i= a.toCharArray();

for (int j = a.length()-1;j>=0; j--) {
	name = name+a.charAt(j);
}
System.out.println(name);
if(name.equals(a)) {
	System.out.println("This is palindrom");
}
else {
	System.out.println("This is not palindrom");
}
		
  String b="jashika",rev="";
  for (int j = b.length()-1;j>=0 ;j--) {
	rev=rev+b.charAt(j);
  }
  if(b.equals(rev)) {
	  System.out.println("It is palindrom");
  }
  else {
	  System.out.println("Not a palindrom");
  }


  int c=2112112,d=0,r;
  int original =c;
  for(int m=0;c>0;m++) {
    r=c%10;
    c=c/10;
    d=d*10+r;  
  }
  System.out.println(d);
System.out.println(c);
if(original==d) {
System.out.println("number is palindrome");
} else {
	System.out.println("Number is not palindrome");
}
		


String s ="saroj",sr="";
for(int i=s.length()-1;i>=0;i--) {
	sr=sr+s.charAt(i);
}System.out.println(sr);
if(sr.equals(s)) {
	System.out.println("This is palindrom");
}else {
   System.out.println("Not a palindrome");
	}
	

String t="naman",nm="";
for(int j=t.length()-1;j>=0;j--) {
	nm=nm+t.charAt(j);
}System.out.println(nm);

if(nm.equals(t)) {
	System.out.println("naman is palindrom");
	}else {
		System.out.println("naman is not a palindrom");
	}
	
String sam="madam",num="";
for(int i=sam.length()-1;i>=0;i--) {
	num=num+sam.charAt(i);
	}System.out.println(num);

if(num.equals(sam))
	System.out.println("I am a palindrome");
else
	System.out.println("I am not a palindrome");
	
	}}


