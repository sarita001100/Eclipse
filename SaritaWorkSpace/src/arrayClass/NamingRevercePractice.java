package arrayClass;

import java.util.Iterator;

public class NamingRevercePractice {

	public static void main(String[] args) {

//  String country []= {"i ", "love ","my ","India"};
//  for(int i=0;i<country.length;i++) {
//  System.out.print(country[i]);
//  }
//System.out.println();
//
//  String []c= {"i ","love ","my ","India "};
//  for(int i=c.length-1; i>=0 ;i--) {
//  System.out.print(c[i]);
//  }
//  System.out.println();
//  
//  String s="i love my india"; 
//    char d[]=s.toCharArray();
//     for (int i= d.length-1;i>=0 ; i--) {
//		System.out.print(d[i]);
//	}
//     System.out.println();
//     
//  String cone="I LOVE MY INDIA ";
// String splt[]= cone.split(" ");
//  for (int i =splt.length-1;i>=0;i--) {
//	System.out.print(splt[i]+" ");  
//	}
//  for(int a=0;a<splt.length;a++) {
//	  String splts=splt[a];
//	  if(splts.equals("LOVE")) {
//		  char[] ab=splts.toCharArray();
//		  for(int b=ab.length-1;b>=0;b--) {
//			  System.out.print(ab[b]);
//		  }
//		  System.out.print(" ");
//	  }
//	  else if(splts.equals("INDIA")) {
//		  char[]cd=splts.toCharArray();
//		  for(int b=cd.length-1;b>=0;b--) 
//			  System.out.print(cd[b]);
//		  }
//	  else { 
//	  System.out.print(splt[a]+" ");}
//	  
         String abc ="I LOVE MY INDIA";
        char[] m= abc.toCharArray();
        for (int i = 0; i < m.length; i++) {
			System.out.print(m[i]);
	}
        System.out.println();
        
        String abc1 ="I LOVE MY INDIA";
       String n[]= abc1.split(" ");
       for (int i = n.length-1; i >=0; i--) {
		System.out.print(n[i]+" ");
		}
//       System.out.println();
//       for (int t = 0; t < n.length; t++) {
//           String df=n[t];
//if(df.equals("Love")) {
//char[]hj=df.toCharArray();
//for (int i = hj.length-1; i>=0; i--) {
//System.out.print(hj[i]+" ");	
//}System.out.println(" ");}
//else if(df.equals("INDIA")) {
//char[]mn=df.toCharArray();
//for(int b=mn.length-1;b>=0;b--)
//System.out.println(mn[b]);}
//else {

	//System.out.print(abc1[i]+" ");
}
}

	
       
  
  
	
	


