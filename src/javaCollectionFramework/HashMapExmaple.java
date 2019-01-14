package javaCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExmaple {
	// No duplicate accepted in HashMap
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Nigeria");
		hm.put(1, "London");
		hm.put(2, "Ghnana");
		hm.put(0, "Nigeria");
		// System.out.println(hm.get(0));

		Set sn = hm.entrySet();
		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}
	}

}
