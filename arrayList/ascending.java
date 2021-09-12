package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ascending {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Z");
		a.add("A");
		a.add("K");
		a.add("N"); 
		System.out.println("Before");
		System.out.println(a);
		System.out.println("After");
		Collections.sort(a);
		System.out.println(a);
		

	}

}


//s.split("\\|")
//s.split("\\ ")
//s.split(,)