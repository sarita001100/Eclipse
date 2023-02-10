package arrayClass;

public class Swith {

//	public  void add(String a,String v,int...x) {
// int temp=0;
//	for (int i = 0; i < x.length; i++) {
//		temp=temp+x[i];
//	}System.out.println(temp);
//	}
//	public void add(int...a){
//		int temp=0;
//		for (int i : a) {
//			temp=temp+i;
//		}System.out.println(temp);
//	}
	public static void main(String...xy) {
		Swith swh=new Swith();
//		int arr[][]=new int [4][5]; 
//		System.out.println(arr);
//		System.out.println(arr[3].length);
//         System.out.println(arr[2][2]);

//swh.add("s","sa",3,4,65,76,88);
//swh.add(4,5);
		
//		int x=5;
//		if(x==1) {
//			System.out.println("one");
//		}else if(x==2) {
//			System.out.println("two");
//		}else if(x==3) {
//			System.out.println("three");
//		}else if(x==4) {
//			System.out.println("four");
//		}else if(x==5) {
//			System.out.println("five");
//		}else {
//			System.out.println("not a list");
//		}

		
		String k="sam";
		switch (k) {
		case "s":{
	System.out.println("one");
			break;
			}
		case "d":{
			System.out.println("two");
					break;
					}
		case "sam":{
			System.out.println("three");
					break;
					}
		default:
			System.out.println("not a list");
			break;
		}
	}

}
