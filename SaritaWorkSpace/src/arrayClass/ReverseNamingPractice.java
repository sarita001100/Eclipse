package arrayClass;

public class ReverseNamingPractice {

	public static void main(String[] args) {
String abc="I AM GOING TO HOME WITH MY FRIEND";
String [] sp =abc.split(" ");
for (int i = 0; i < sp.length; i++) {
	if(i% 2==0) {
	String sh= sp[i];
	char[] sis=sh.toCharArray();
	for (int j =sis.length-1; j >=0;j --) {
	System.out.print(sis[j]);	
	}
	System.out.print(" ");}
	else {
		System.out.print(sp[i]+" ");
	}}
    System.out.println();
    
    
    String lpg="INDIA IS MY COUNTRY";
    String [] lt= lpg.split(" ");
    for (int i = 0; i < lt.length; i++) {
		if(i%2==0) {
		String hs=lt[i];
		char[] cr=hs.toCharArray();
		for (int j = cr.length-1; j >=0; j--) {
			System.out.print(cr[j]);
		}
		System.out.print(" ");
		}else {
			System.out.print(lt[i]+" ");
		}
	}


	}}
