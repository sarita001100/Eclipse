package abc;

public class ReturnConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a= getFullName ("sarita ","yadav ","mondh ");
  String b= getFullName  ("riya ","yadav ","mondh ");
  String c= getFullName  ("kavita ","yadav ","mondh ");
	//System.out.println(fullName);	
		
	}
public static String getFullName(String firstName,String lastName,String villageName){
	String fullName= firstName+villageName+lastName;
	System.out.println(fullName);
	return fullName;
	//System.out.println(fullName);
	}
}
