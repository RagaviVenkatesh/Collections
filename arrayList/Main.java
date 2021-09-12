package arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add("A"); //index-2
		a.add(5);
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2,"m");
		System.out.println(a);
		System.out.println(a.size());
	}

}
