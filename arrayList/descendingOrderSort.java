package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class descendingOrderSort {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Z");
		a.add("A");
		a.add("K");
		a.add("N");
		a.add("Z");
		System.out.println("Before");
		System.out.println(a);
		System.out.println("After");
		Collections.sort(a,new MyComparator());
		System.out.println(a);
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
	
}