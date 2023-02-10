package arrayClass;

public class Adding_divide_ {

	public static void main(String[] args) {
		///for febonocci series

		int ab []= {1,2,3,4,6,9};
		int sum=0;
		for (int i = 0; i < ab.length; i++) {
		sum=sum+ab[i];
		System.out.print(sum+" ");
		}
		System.out.println();
		
	//adding all numbers method	
		int num[]= {3,5,7,8,9};
		int sum1=0;
		for (int i = 0; i < num.length; i++) {
		sum1=sum1+num[i];
		}
		System.out.print(sum1);
		System.out.println();
		
	//divide method
		int sp[]= {6,7,8,9,5};
		//int r=sp.length;
		int ad=0;
		for (int i = 0; i < sp.length; i++) {
		 ad=ad+sp[i];	
		}
		System.out.println(ad/sp.length);
		
		//fabonaci series
		int abc[]= {3,5,6,7};
		int total=0;
		for (int i=0; i<abc.length;i++) {
		total=total+abc[i];
		System.out.print(total+" ");
		}
		System.out.println();
		
		//febonacci series
		int jkl[]= {3,3,4,6,1,2};
		int sum2=0;
		for (int i = 0; i < jkl.length; i++) {
			sum2=sum2+jkl[i];
			System.out.print(sum2+" ");
		}//fabonacci 
		System.out.println();
		int abs[]= {2,3,5,6,7};
		int hcl=0;
		for(int p=0;p<abs.length;p++) {
			hcl=hcl+abs[p];
			System.out.print(hcl+" ");
		}
		System.out.println();
		//adding number
		int png[]= {3,5,6,7,8};
		int gh=0;
		for (int i = 0; i < png.length; i++) {
			gh=gh+png[i];
		}
		System.out.print(gh+" ");
System.out.println();
		//adding 
		int fgh[]= {5,6,3,2,1,4};
		int jekl=0;
		for (int i = 0; i < fgh.length; i++) {
			jekl=jekl+fgh[i];
		}System.out.print(jekl);
		
		System.out.println();
		//divide
		
		int pwd[]= {3,4,6,8,9,2,4};
		int you=0;
		for (int i = 0; i < pwd.length; i++) {
			you=you+pwd[i];
			}
		//System.out.print(you);///adding
		System.out.print(you/pwd.length);//divide
	}

}
