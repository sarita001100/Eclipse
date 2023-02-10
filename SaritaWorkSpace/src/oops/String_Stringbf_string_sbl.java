package oops;

public class String_Stringbf_string_sbl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Sky";
		String b= "Sky";
		
		a=a.concat("yadav");
		
		System.out.println(a);
		
		StringBuffer sb= new StringBuffer("janvika");
		
		sb.append("yadav");
		System.out.println(sb);
		
		StringBuilder sbl= new StringBuilder("abhimanyu");
		sbl.append("yadav");
		System.out.println(sbl);
		
		String g= new String ("diya");
		String c=new String ("diya");
		System.out.println(g==c);
		

	}

}
