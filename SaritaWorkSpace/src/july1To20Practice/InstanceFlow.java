package july1To20Practice;

public class InstanceFlow {//non static
  int a=12;
  
  {
	
	  System.out.println("i am first block");
  }
  
   static void method()
   {
	   int b=16;
	   float g=1.2f;
	   System.out.println(b+g);
	   System.out.println("i am method");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceFlow day = new InstanceFlow();
    System.out.println(day.c); 
 System.out.println("i am main");
 day.a =33;
 System.out.println(day.a);
 method();
 day.method(5);
	}
  int c=23;
  public static void  method( int a) {
	 InstanceFlow mon = new InstanceFlow();
	 int k=26;
	System.out.println(k); 
	mon.method();
	       
  }
  public  void method2() {
	 char r;
  }
  char r =34;
  
}
