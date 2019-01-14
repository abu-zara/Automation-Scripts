package Inheritance;

public class Son extends Grandfather{

	public static void main(String[] args) {

		Son s = new Son();
		s.city();
		s.country();
	}
	
	public void activities(){
		System.out.println("activities");
	}

}
