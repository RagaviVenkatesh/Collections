package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

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
		Collections.reverse(a);;
		System.out.println(a);

	}

}
