package abc;

public class TypesOfForLoop {

	public static void main(String[] args) {
//(1)
	for(int a=1;a<=4;a++) {
		for(int j=1;j<=a;j++) {
			System.out.print("*");
	}
	System.out.println();	
	}	
		
	System.out.println();/////lineChange
//(2)
	for(int a=1;a<=4;a++) {
		for(int j=4;j>=a;j--) {
			System.out.print("*");
	}
	System.out.println();	
	}	
	
	 System.out.println();/////lineChange(3)
	for(int s=1;s<=4;s++) {
		for(int r=1;r<=4;r++) {
			
	 if(s==1||r==1||s==4||r==4)	{
		 System.out.print("*");
	 }
	 else {
		 System.out.print(" ");
	 }
	}
	System.out.println();	
	}	
	System.out.println();//lineChange(4)
	
	for(int a=1;a<=4;a++) {
		for(int b=1;b<=a;b++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int m=1;m<=4;m++) {
		for(int n=3;n>=m;n--) {
			System.out.print("*");
		}
		System.out.println();
		}
	System.out.println();///lineCange(5)
	
	for(int j=1;j<=4;j++) {
		for(int k=3;k>=j;k--) {
			System.out.print(" ");
		}
		for(int l=1;l<=j;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();//lineChange(6)
	
	for(int a=1;a<=4;a++) {
		for(int b=2;b<=a;b++) {
			System.out.print(" ");
		}
		for(int c=4;c>=a;c--) {
			System.out.print("*");
		}System.out.println();
	}
	}

}
