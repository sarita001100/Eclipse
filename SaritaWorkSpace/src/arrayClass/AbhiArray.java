package arrayClass;

import javax.swing.DefaultListSelectionModel;

public class AbhiArray {
public static void main(String[] args) {
//	int a[]= {23,23,23};
//	double d []= new double[7];
//	 d[2]= 2;
//	 d[1]= 3;
//	 d[3]= 320;
//	 d[4]=7;
//	 d[0]=5;
//	 for(int i=d.length-1; i>=0; i--) {
//		 System.out.println(d[i]+i+1);
//	//  String a[]=  {"po", "sha","neel","uri"};
//         for(int i=a.length-1; i>=0; i--) {
//        	char ab= a[2].charAt(i);
//       	 System.out.print(ab);
//} 
	      String s []= {"evs", "coaching"};
              //  String[]sp= s.split("");
         System.out.println(s.length);
           for(int j=s.length-1;j>=0;j--) {
              System.out.println(j+s[j]+" ");
        	  }
            String a ="mam";
           String totl=a;
          String rev="";
           for(int i=a.length()-1;i>=0;i--) {
        	rev=rev+a.charAt(i); 
            } System.out.println(rev);
           if(totl.equals(rev)) {
        	   System.out.println("It is palindrome");
           }else {
           System.out.println("Not a palindrome");
           }
              int no = 3443,rem,revs=0 ;
           int ttl=no;
           while(no!=0) {
        	   rem=no%10;
        	   revs=revs*10+rem;
        	   no=no/10;
           }  System.out.println(revs);
           if(ttl==revs) {
        	   System.out.println("this is palindrome");
           }else{System.out.println("not a palindrome");
        	    }
           
           String st= "shayam",total=st;
            String revrs="";
           for(int i=st.length()-1;i>=0;i--) {
        	   revrs=revrs+st.charAt(i);
           }System.out.println(revrs);
           if(total.equals(revrs)) {
        	   System.out.println("this is a palindrome");
           }else
           {
        	   System.out.println("this is not a palindrome");
           }
        	int nos = 2356, rems,revers=0;  
        	int noss=nos;
           while(nos !=0) {
        	   rems=nos%10;
        	   revers=revers*10+rems;
        	   nos= nos/10;
        	   }System.out.println(revers);
        	   if(revers==noss) {
        		   System.out.println("it is a palindrome");
        	   }else {
        		   System.out.println("not a palindrome");
        	   }
        	  
} 
}
	


