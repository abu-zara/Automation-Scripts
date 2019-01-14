package utilities;
import java.util.ArrayList;
import java.util.List;

public class UniquePairs2 {
	public static void main(String[] args) {
		List lst = new ArrayList();
		findThePairs(new int[] { -1, 2, 1, 4, 5, 1, 3, 6, 2, 8}, 7);
	}
		
	static void findThePairs(int inputArray[], int inputNumber) {
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}
			}
		}
	}

	
}

