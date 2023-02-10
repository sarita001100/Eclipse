package oops;

public class encapsulation {

private int id;                   	//dataHiding
	
public void method1(int ida) { 
	//setter method
	id=ida;
	System.out.println(id);
}
	public int method2() {        //getter method
		return id;
	}
//	public static void m1() {
//	System.out.println("parent class static method");	
//	}
//	

public static void main(String[] args) {

	encapsulation enc=	new encapsulation();
	enc.method1(7);
enc.method2();
}
}