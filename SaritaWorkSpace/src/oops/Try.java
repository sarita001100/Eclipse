package oops;

public class Try {

	public static void main(String[] args) {
System.out.println("sarita");
	
    String a="ram";
	 a="shayam";
	System.out.println(a==a);
	String b="riya";
	b="riya";
	System.out.println(b==b);
	}
	public static void met() {
		System.out.println("parent class met method");
	}
}
//class By extends Try{
//public static void met(int a) {
//	System.out.println("child class met method");
//}
//public static void main(String[] args) {
//	Try s=new By (); 
//	s.met(12);
//met();
//Try.met();
//}
//}