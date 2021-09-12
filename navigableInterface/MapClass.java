package navigableInterface;

import java.util.TreeMap;
import java.util.TreeSet;

public class MapClass {

	public static void main(String[] args) {
		TreeMap t = new TreeMap();	
		t.put(15,"A");
		t.put(5,"H");
		t.put(1,"L");
		t.put(51,"P");
		t.put(40,"S");
		
		
		System.out.println(t);
		System.out.println(t.ceilingKey(15));
		System.out.println(t.higherKey(15));
		System.out.println(t.floorKey(15));
		System.out.println(t.lowerKey(15));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t);
		System.out.println(t.descendingMap());

	}

}
