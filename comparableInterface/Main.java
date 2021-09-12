package comparableInterface;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
//		System.out.println("A".compareTo(null));
		
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t); //[0,10,15]
	}

}

//