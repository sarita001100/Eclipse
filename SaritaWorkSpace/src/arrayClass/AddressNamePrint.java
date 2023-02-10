package arrayClass;

import java.util.Scanner;

public class AddressNamePrint {
	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
        String y_n=" ";
     do {  System.out.println("please enter name");
         String str=   scr.next();
    	  switch (str) {
       case "sarita":{
    	  System.out.println("Mumbai");
    	  break;
    	   }
      case "riya":
    	  System.out.println("mondh");
    	  break;
      
      case "jiya":{
    	  System.out.println("madiyahu");
    	  break;
      }
      case "siya":{
    	  System.out.println("Jaunpur");
    	  break;
      }
      default :{
    	  System.out.println("not in list");
    	  break;
      }
      }System.out.println("Do you want to another name");
  	y_n=scr.next();
     }while(y_n.contains("yes"));
      System.out.println("Thank you");	
      
      
           

}}
