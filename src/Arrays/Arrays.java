package Arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int b[] = {1,2,3,4,9};
		
	     int a[] = new int [5]; // allocating memory to the array list
	
	     a[0]=1;
	     a[1]=2;
	     a[2]=3;
	     a[3]=4;
	     a[4]=5;
	     
	     for (int i =0; i<a.length;i++){
	    	 System.out.println(a[i]);
	    	 
	    	 if ( a[i]==4) {
	    		  break;				
			}
	     }
		
	}

}
