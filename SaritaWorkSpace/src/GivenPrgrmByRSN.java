import javax.swing.text.html.StyleSheet;

public class GivenPrgrmByRSN {

	public static void main(String[] args) {
		String jan="janvika is a great girl";
		jan=jan.replaceAll(" ", "");
		System.out.println(jan);

		//letter after letter
String name="my name is sarita";
char[] ch= name.toCharArray();
for(int i=0;i<name.length();i++) {
	
	System.out.print(++ch[i]);
}System.out.println();

//reverse letter
String same="home sweet home";
String []sa= same.split(" ");
for(int i=0;i<sa.length;i++) {
char[] chr=	sa[i].toCharArray();
for (int j =sa[i].length()-1;j>=0; j--) {
	System.out.print(chr[j]);
}System.out.print(" ");
}System.out.println();

//count repeted letter .
String str= "India is great".toLowerCase();
for(char st='a';st<='z';st++) {
	int count =0;
	for(int i=0;i<str.length();i++) {
		if(st==str.charAt(i)) {
			count++;
		}
	}if(count>0) {
		System.out.println(st+"="+count);
	}
}System.out.println(); 

//print next word
String abc="virat is great";
for(int i=0;i<abc.length();i++) {
char [] chr = abc.toCharArray();
System.out.print(++chr[i]+"");
}System.out.println();

String sab="india is my country";
for(int i=0;i<sab.length();i++) {
	char car=sab.charAt(i);
	System.out.print(++car+" ");
}System.out.println();

String zee="water  is life";
String san=zee.toUpperCase();
System.out.println(san);

String news="BE COOL ALWAYS".toLowerCase();
String fab=news.toLowerCase();
System.out.println(fab);

//vowel count
String strt="Hello Good Morning Mumbai";
int vcount=0;
String  count=" ";
for(int i=0;i<strt.length();i++) {
	char ch1=strt.charAt(i);
	if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
		System.out.print(ch1);
		vcount++;
	}else if(ch1>='a'&& ch1<='z') {
		count=" ";
	}
}System.out.println();
System.out.print("numbers of vowels:"+vcount);














	}
	
}