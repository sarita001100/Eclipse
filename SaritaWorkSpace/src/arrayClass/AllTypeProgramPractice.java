package arrayClass;

public class AllTypeProgramPractice {

	public static void main(String[] args) {
////1=palindrome
		int a=1221, b=0,c;
		int orgnl=a;
		while(a>0) {
			c =a %10;
			b= b*10+c;
			a= a/10;
			}
		System.out.println(b);
		System.out.println(a);
		
		if(b==orgnl){
			System.out.println("This is palindrome");
		}else
		{
			System.out.println("This is not a palindrome");
		}
		///2=dital sum
		
		int z= 1245, x=0,v;
		while(z>0) {
		v=z%10;
		x=x+v;
		z=z/10;
		}
		System.out.println(x);
		
		///3=odd or even
		
		int h=35;
		if(h%2==0) {
			System.out.println("this is even number");
		}else {
			System.out.println("this is odd number");
		}
		
		///4=string reverce
		
		String same="kanak", name="";
		for(int i =same.length()-1;i>=0;i--) {
			
			name=name+same.charAt(i);
			}
		System.out.println(name);
		if(name.equals(same)) {
			System.out.println("This String is palindrome");
		}else {
			System.out.println("This String is not a palindrome");
		}
		///5=fabonocci series
		
		int j=0, k=1,l;
		for(int i=0;i<8;i++) {
			l=j+k;
			System.out.print(l+" ");
			j=k;
			k=l;
			}System.out.println();
		///6=swapping 2 numbers
		
		int p= 10, o =20;
		p=p+o;
		o=p-o;
		p=p-o;
		
		System.out.println("p= "+p);
		System.out.println("o= "+o);
		
		//7=swapping 3 numbers
		
		int d=30,f=40, y;
		y=d+f;
		f=y-f;
		d=y-d;
		System.out.println("f= "+f);
		System.out.println("d= "+d);
	
		//8=swapping 3 numbers
		int g=23 ,q= 13, t;
		t=g;
		g=q;
		q=t;
		System.out.println("g= "+g);
		System.out.println("q= "+q);
		
	///9=add array	
	
		
		
		
	}

}
