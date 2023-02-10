

public class practice {

	public practice() {
	}

	public static void main(String[] args) {
///swapping with 3
		int a ,b ,c;
		a=12;
		b=23;
		System.out.println(a+" "+b);
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
	
		//swapping with 2
		int p,q;
		p=44;
		q=55;
		p=p+q;
		q=p-q;
		p=p-q;
		System.out.println(p+" "+q);
		
		//palindrome number
		
		int z= 3663, sum=0,total=z;
		while(z>0) {
			int r= z % 10;
			sum= sum*10+r;
			z= z/10;
			}
		if(total==sum) {
			System.out.println("palindrome");
		}else
			System.out.println("NOT PALINDROME");
			
		//digit sum
		
		int h= 456, k=0;
		while(h>0) {
			int l=h% 10;
			k=k+l;
			h=h/10;
			//System.out.println(k);
		}			System.out.println(k);

		
	}

}
