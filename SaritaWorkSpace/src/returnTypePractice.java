 
public class returnTypePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
  int salary=mySalary(a,200,300);
  
  
	}
   public static int mySalary(int besic,int hra,int pf ) {
	 int mySalary = besic+hra+pf; 
	 System.out.println(mySalary);
	return mySalary; 
   }
	
	
	
}
