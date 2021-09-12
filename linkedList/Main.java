package linkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("Ragavi");
		l.add(19);
		l.add(null);
		l.add("abc");
		l.add(70);
		System.out.println(l);
		l.add(2, "thuj");
		System.out.println(l);
		l.set(2, "opkl");
		System.out.println(l);
		l.addFirst("ttt");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
	}

}
