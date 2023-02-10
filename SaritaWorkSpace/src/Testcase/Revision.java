package Testcase;

public class Revision {
	int i= 15;
	public static Revision m1(int f) {
		Revision a=new Revision();
		
		System.out.println(a.i);
		return new Revision() ;
	}
 public static String m2(int g, int b) {
	 System.out.println("i am method 2");
	 return "hello";
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Revision a1=m1(6);
 System.out.println(a1.m1(7));
 
 System.out.println(a1.m2(7,9));
	}

}