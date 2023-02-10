package arrayClass;

import java.util.ArrayList;

public class ArrayMethod {

	public static void main(String[] args) {
ArrayList<Integer>list=new ArrayList<>();
list.add(0);
list.add(3);
list.add(6);
System.out.println(list);//addElement

int elements=list.get(2);
System.out.println(elements);
System.out.println(list.get(1));///get element

list.add(1, 1);
System.out.println(list);

list.add(2, 5);
System.out.println(list);///addElement in between

list.set(1, 7);
System.out.println(list);//set element

list.remove(3);
System.out.println(list);//delete element

int size=list.size();
System.out.println(size);//size

for (int i = 0; i < list.size(); i++) {
	System.out.print(list.get(i)+" ");
	
}System.out.println();

String con="I LOVE MY INDIA";
char a[]=con.toCharArray();
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]);
}System.out.println();

String cone="I LOVE MY INDIA";
char b[]=cone.toCharArray();
for (int i = b.length-1; i>=0 ; i--) {
	System.out.print(b[i]);
}System.out.println();

String abc="INDIA IS MY COUNTRY";
String [] ab=abc.split(" ");
for (int i = ab.length-1; i >=0; i--) {
	
	System.out.print(ab[i]+" ");
}
System.out.println();

	

	int p[]=new int[4];
	p[0]=45;
	p[1]=56;
	p[2]=67;
	p[3]=77;
	//System.out.println(p[2]);
	for(int i=0;i<p.length;i++) {
		System.out.println(p[i]);
	}
}}
