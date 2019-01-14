package utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniquePairs {

	public static void main(String[] args) {
		numberOfPairs(new Integer[] { -1, 2, 1, 4, 5, 1, 3, 6, 2, 8 }, 7);
		
		
	}

	public static void numberOfPairs(Integer[] arraylist, int sum) {
		Set<Integer> set = new HashSet<>(Arrays.asList(arraylist));

		// this set stores the unique pairs.
		Set<String> uniquePairs = new HashSet<String>();

		for (int i : set) {
			int x = sum - i;
			if (set.contains(x)) {
				int[] a = new int[] { x, i };
				Arrays.sort(a);
				uniquePairs.add(Arrays.toString(a));
			}
		}

		System.out.println("The number of Unique Pairs is = " + uniquePairs.size());
		System.out.println("The pairs are as follows : " + uniquePairs);
	}
	
//	public static void sumPairs(Integer[] input, int sum){
//	    List<Integer> complementaries = new ArrayList<>(input.length);
//	    int pairs = 0;
//	    for(Integer number : input){
//	        if(complementaries.contains(number)){
//	            complementaries.remove(number);
//	            pairs++;
//	        }
//	        else{
//	            complementaries.add(sum-number);
//	        }
//	    }
//		System.out.println(complementaries);
//
//	    //return pairs;
//	}
}

