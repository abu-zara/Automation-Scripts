package Inheritance;

public class Grandson extends Son{

	public static void main(String[] args) {

		Grandson gs = new Grandson();
		
		gs.country();
		gs.city();
		gs.activities();
		
		int sum = 0;
		int c[] = {2,5,8,7,4};
		for (int i =0; i<c.length; i++){
		//sum = sum + c[i];	
					
				System.out.println(c[i]);
				if(c[i]==8){
					break;
				}
			
		}
			//System.out.println(sum);
			//System.out.println(c[2]);
			//creating an array
				
			
		
	}
	
	
	
	

}
