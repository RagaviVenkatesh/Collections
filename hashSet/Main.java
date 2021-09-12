package hashSet;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add(1);
		h.add(11);
		h.add(12);
		h.add(13);
		h.add(14);
		h.add(15);
		
		System.out.println(h);
		
		h.add(null);
		h.add(13);
		h.add(1);
		
		System.out.println(h.add(13));
		
		System.out.println(h);
	}

}
