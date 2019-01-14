package javaCollectionFramework;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {

		//ArrayList, LinkedList and Vector implements the List interface
		// duplicates accepted
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Zara");
		a.add("Zara");
		a.add("Zaynab");
		System.out.println(a);
		a.add(0, "diva"); // in arrayList, addition can be at any index position. This is not possible with array
		// because arrays has to be sequential.
		System.out.println(a);
		System.out.println(a.contains("mum"));
		System.out.println(a.indexOf("Zara"));
	}

}
