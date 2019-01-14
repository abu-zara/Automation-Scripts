package refreshJava;

public class SwitchStatements {

	public static void main(String[] args) {

		int switchValue = 5;

		switch (switchValue) {
		case 1:
			System.out.println("switch value was 1");
			break;

		case 2:
			System.out.println("Switch value was 2 ");

		case 3:
		case 4:
		case 5:
			System.out.println("was either 3, 4 or 5");
			System.out.println("actual value was " + switchValue);
			break;

		default:
			System.out.println("was not 1 or 2");
		}

		char switchChar = 'A';

		switch (switchChar) {

		case 'B':
			System.out.println("value is B");
			break;

		case 'C':
			System.out.println("value is C");
			break;

		case 'D':
			System.out.println("value is D");
			break;

		default:
			System.out.println("Value is " + switchChar);
		}
		
		
		
		String switchString = "January";

		switch (switchString.toLowerCase()) {

		case "Februaury":
			System.out.println("value is Februaury");
			break;

		case "March":
			System.out.println("value is March");
			break;

		case "April":
			System.out.println("value is April");
			break;

		default:
			System.out.println("Value is " + switchString);
			
		}
	}

}
