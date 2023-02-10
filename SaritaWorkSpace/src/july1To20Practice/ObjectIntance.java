package july1To20Practice;

public class ObjectIntance {
	ObjectIntance(){
		methodOne();
		System.out.println("I am Constructor");
	}
	ObjectIntance(int i){
		System.out.println("I am constructor no two");
	//new ObjectIntance();
	}
	int i;
	{
		System.out.println("first instance block");
		//new ObjectIntance();
	}
	public void methodOne() {
		System.out.println("method one");
		System.out.println("j="+j);
	}
	int j=20;
	public static void main(String[] args) {
ObjectIntance var = new ObjectIntance();
new ObjectIntance(6);
	}
	
// static int a =2;
//	static{
//		System.out.println(a);
//	}
//	{System.out.println("i am first constructer");
//	Mg();
// }
//	{
//		System.out.println("i am second constructer");
//		//System.out.println(l);
//	}{
//	int l =12;	
//	System.out.println(l);
//	}
//	
//	static int g=12;
//	static{
//		 char g =2;
//		 System.out.println(g);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//ObjectIntance var =new ObjectIntance();
//	 Mg();
//	// System.out.println(l);
//	}
//public static void Mg(){
//System.out.println("mm");
//System.out.println("i am first constructer two");	
// System.out.println(g);
//}
}