package Testcase;

public class Variable {
static int i=10;
int a=5;
  public static int methodOne() {
	  int result=i*i*i;
	  return i*5;
  }

	public static void main(String[] args) {
//		int x=methodOne()+methodOne();
//		System.out.println(x);
		Variable xyz=new Variable();
		xyz.a=50;
		Variable pqr=new Variable();
		pqr.a=34;
		System.out.println(xyz.a);
		System.out.println(pqr.a);
		xyz.i=555;
		System.out.println(xyz.i);
		xyz.i=666;
		System.out.println(xyz.i);
		
		// TODO Auto-generated method stub
 System.out.println(i);
 i =13;
 System.out.println(i);
 Variable var=new Variable();  //object
  System.out.println(var.a);
  var.a=6;
  System.out.println(var.a);
   Variable var1=new Variable();//object
   System.out.println(var1.a);
   var1.a=61;
   System.out.println(var1.a);
  Variable var2=new Variable();//object
  System.out.println(var2.a);
  var2.a=23;
  System.out.println(var2.a);
  System.out.println(var.a);
  System.out.println(var.i);
  var1.i=111;
  System.out.println(var.i);
  var1.a=555;
  System.out.println(var.a);
  
  
  
  
  
  
	}

}
