package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
//		HashMap m = new HashMap();
//		LinkedHashMap m = new LinkedHashMap();
		TreeMap m = new TreeMap();
		
		m.put("A", 200);
		m.put("N", 100);
		m.put("Z", 700);
		m.put("C", 500);
		m.put("P", 300);
		
		m.put("N", 400);
		m.put("N", 1000);
		
		Set s1 = m.entrySet();
		
		System.out.println(m);

		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println("Key: "+m1.getKey()+" Value: "+m1.getValue());
		}
	}

}
