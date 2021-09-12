package navigableInterface;

import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();	
		t.add(15);
		t.add(5);
		t.add(1);
		t.add(51);
		t.add(40);
		
		System.out.println(t);
		System.out.println(t.ceiling(15));
		System.out.println(t.higher(15));
		System.out.println(t.floor(15));
		System.out.println(t.lower(15));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.descendingSet());

	}

}
