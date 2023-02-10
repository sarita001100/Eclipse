package loopall;

public class shnek {
 int i=10;
 
 static {
	 new shnek();
 }
 {
	 System.out.println("First instanc Block");
 }
	static {
		System.out.println("static block*******");
	}
	public static int m1() {
		System.out.println("Hello m1");
		return 0;
	}
	shnek(){
		System.out.println("I am cunstructer of instance control Floe class");
	}
public static void main(String[] args) {
	System.out.println("hello");
	 shnek s=new shnek ();
}
{
	System.out.println("second instance block");
  m1();
  
}
	float j;
	
	}

