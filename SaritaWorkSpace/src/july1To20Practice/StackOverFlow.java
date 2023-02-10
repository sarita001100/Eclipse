package july1To20Practice;

public class StackOverFlow {
 int a=12;
 public static  StackOverFlow method() {
	// StackOverFlow b=new StackOverFlow();
 return new StackOverFlow();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOverFlow b=new StackOverFlow();
		//b=null;
		//main (null);
		System.out.println(method());
	}

}
