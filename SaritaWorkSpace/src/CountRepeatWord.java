import java.util.Iterator;

public class CountRepeatWord {

	public static void main(String[] args) {
String word ="Nature is beatiful as SKY is blue".toLowerCase();

for(char ab='a';ab<='z';ab++) {
	int count=0;
	for(int i=0;i<=word.length()-1;i++) {
		if(ab==word.charAt(i)) {
			count++;
		}
	}if(count>0) {
		System.out.println(ab+":"+count);
 }
}System.out.println();

String student ="All Student present in class".toLowerCase();
char std;
for( std='a';std<='z';std++){
	int count=0;
	
	for(int i =0;i<=student.length()-1;i++) {
		if(std==student.charAt(i)) {
			count++;
		}
	}if(count>0) {
		System.out.println(std+" "+count);
	}
}




	}
	}
