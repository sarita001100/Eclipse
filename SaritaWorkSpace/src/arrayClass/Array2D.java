package arrayClass;

import java.util.Iterator; 

public class Array2D {

	public static void main(String[] args) {
int a[][]= {{6,7,8},{3,8,5}};

System.out.println(a[1][2]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a.length);
			for(int j=0;j<a[i].length;j++) {

				System.out.print(a[i][j]+" ");
			}	}		System.out.println();


		int b[][]= {{2,4,6,8},{7,8,8}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
	String s[][]= {{"sun","mon","tue"},{"wed","thur","fri"}};
 System.out.println(s[0][1]);
	for (int i = 0; i < s.length; i++) {
		for (int j = 0; j < s[i].length; j++) {
			System.out.print(s[i][j]+" ");
		}System.out.println();
	}
	
		int in[][]=new int [3][3];
		 for (int i = 0; i < in.length; i++) {
		for (int j = 0; j < in[i].length; j++) {
			in[i][j]=j+450+i+i+i;
		System.out.print(in[i][j]+" ");	
		}System.out.println();
	}
		String sam[][]= new String [3][3];
		sam [0][0]="first name";
		sam [0][1]="last name";
		sam [0][2]="age";
		
		sam [1][0]="sarita";
		sam [1][1]="yadav";
		sam [1][2]="12";

		sam [2][0]="jiya";
		sam [2][1]="ahir";
		sam [2][2]="14";
		
		for (int i = 0; i < sam.length; i++) {
			for (int j = 0; j < sam[i].length; j++) {
			System.out.print(sam[i][j]+" ");	
			}System.out.println();
		}

		
		String arr[][][]= {{{"jan","fab","mar"},{"apr","may","jun"}},{{"jul","aug","sep"}}};
		for (String[][] str : arr) {
			for (String[] strings : str) {
        for (String strings2 : strings) {
			System.out.print(strings2+" ");
		}	System.out.println();
			}
		}
		int work[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for (int i = 0; i < work.length; i++) {
			for (int j = 0; j < work[i].length; j++) {
				System.out.print(work[i][j]+" ");
			}System.out.println();
		}
		int done[][]=new int [2][2];
		done[0][0]=12;
		done[0][1]=13;
		done[1][0]=14;
		done[1][1]=15;
		for (int i = 0; i < done.length; i++) {
			for (int j = 0; j < done[i].length; j++) {
				System.out.print(done[i][j]+" ");
	}System.out.println();
		}
		
	}

}
