package arrayClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		List ar = new ArrayList();
		ar.add("ashok");
		ar.add(30);
		ar.add(null);
		ar.add('s');
		// System.out.println(ar);
//		Iterator it = ar.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			System.out.println(it.hasNext());
//		}

		Iterator lit = ar.iterator();
//		lit.next();
//		lit.next();
		
		 while (lit.hasNext()) {
		System.out.println(lit.next());
		//System.out.println(lit.hasNext());
	}
		 ar.set(1, "sam");
	System.out.println(ar);
	
//		while (lit.hasPrevious()) {
//			System.out.println(lit.previous());
//		}
//		Vector vc = new Vector();
//		for (int i = 0; i <= 10; i++) {
//			vc.addElement(i);
//		}
//		// System.out.println(vc);
//		Enumeration e = vc.elements();
//		while (e.hasMoreElements()) {
//		} // System.out.println(e);
	}

}
