package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();

		for(int i=0;i<=10;i++) {
			a.add(i);
		}
		
		System.out.println(a);
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			if(i%2==0)
				System.out.println(i);
			else
				itr.remove();
		}
		
		a.add(10);
		
		System.out.println(a);
	}

}
