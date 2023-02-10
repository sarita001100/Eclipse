package july1To20Practice;
 
public class StaticBlock {
	
	static  int d ;
static 	int b= 16;
 public static int method() {
	 int var =b*b*b;
	System.out.println(var); 
	System.out.println(b);
	return b;
 }
	static {
		System.out.println(b);
	//System.out.println(d);
	}
static int c=18;
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println(d);
	int var2 =method()+method()+method();
}
  public static void m1() {
	int j=5;
	System.out.println(j);
  }
  static {
	  System.out.println("i am first static block");
	  
  }
}
