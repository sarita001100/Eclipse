package arrayClass;

public class reverse {
public static void main(String[] args) {

	  int c=2112112,d=0,r;
	  int original =c;
	  while(c>0) {
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
		
	int sum =12621,num=0,p;
	int save=sum;
	while(sum>0) {
		p=sum%10;
		sum=sum/10;
		num=num*10+p;
	}
	System.out.println(sum);
	System.out.println(num);
	if(save==num) {
		System.out.println("This no.is palindrome");}
	else {
		System.out.println("This no. is not a palindrome");
	}
	
	String sam="janvi",nam="";
	for(int i=sam.length()-1;i>=0;i--) {
		nam=nam+sam.charAt(i);
	}System.out.println(nam);
	
	if(nam.equals(sam)) {
		System.out.println("palindrome");
	}else
		System.out.println("Not palindrome");
	
	
	int jas=1221,tas=0,u;
	int str=jas;
	while(jas>0) {
		u=jas%10;
		jas=jas/10;
		tas=tas*10+u;
	}System.out.println(jas);
	System.out.println(tas);
	if(str==tas) {
		System.out.println("THIS IS PALINDROME NUMBER");
		}else
			System.out.println("THIS IS NOT A PALINDROME");
	
	
		}

}
