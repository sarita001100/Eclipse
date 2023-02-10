package arrayClass;

public class ArrayPrgrm {

	public static void main(String[] args) {
//
//		String sam="saritayadav";
//		for (int i = 0; i < sam.length(); i=i+3) {
//			char s=sam.charAt(i);
//			System.out.print(s);
//		}System.out.println();
//		
//		int ary[] = {3,4,5,6};
//		for (int i : ary) {
//		System.out.println(i);	
//		}
		
	int a[][]= new int [3][4];	
		a[0][0]= 10;
		a[0][1]= 7;
		a[0][2]=4;
		a[0][3]=8;
		
		a[1][0]= 14;
		a[1][1]= 8;
		a[1][2]=65;
		a[1][3]=88;
		
		a[2][0]= 100;	
		a[2][1]= 101;
		a[2][2]=44;
		a[2][3]=77;
		
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		
		  for (int i = 0; i < a.length; i++) {
        	for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
		  
		  int g[][]= new int [1][4];	
			a[0][0]= 10;
			a[0][1]= 7;
			a[0][2]=4;
			a[0][3]=8;  
			System.out.println(g[0].length);
	}

}
