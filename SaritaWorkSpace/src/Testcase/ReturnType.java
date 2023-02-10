package Testcase;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a =1000;
  calculateSalary (a,2000,1000);
  int grossSalary =calculateSalary(3000,4000,2000);
  int taxvalue=grossSalary*10/100;
  calculateSalary(4000,8790,6789);
	}
  public static int calculateSalary(int basic, int hra, int pf) {
	 int grossSalary= basic+hra+pf;
	 if(grossSalary>10000) {
		 System.out.println("I am in if condition");
	 }
	 System.out.println(grossSalary);
	 return grossSalary;
	 
  }
}








