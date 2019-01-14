package javaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {

		// Hashset, linkedhashset and treeset implements set interface
		// no duplicate accepted
		// data stored in random manner.

		HashSet<String> h = new HashSet<String>();
		h.add("zee");
		h.add("ze");
		h.add("e");
		h.add("zr");
		h.add("z");

		System.out.println(h); // no duplicates accepted
		Iterator<String> i = h.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}
}
