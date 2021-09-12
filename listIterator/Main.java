package listIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		
		System.out.println(l);
		
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			
			if(s.equals("a")) {
				itr.remove();
			}
			if(s.equals("b")) {
				itr.set("bbb");
			}
			if(s.equals("d")) {
				itr.add("f");
			}
		}
		
		System.out.println(l);
	}

}
