package InterfaceConcepts;

public class Developing implements bankingClient, Domainclient{
	
	
	public static void main(String [] args){
		
		Developing d = new Developing();
		//with d, // you can access all methods in the class
		
		d.checkbalance();
		d.transferbalance();
		d.transferbalance();
		
		bankingClient dr = new Developing();
		//dr  using dr object, u can only access the methods in bankingClinet. //Run time polymorphism.
		dr.checkbalance();
		
		Domainclient dm = new Developing();
		//using dm object, u can only access the methods in bankingClinet.
		
		dm.investment();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("paycreditcard implemented");
		
	}

	@Override
	public void transferbalance() {
		System.out.println("transfer balance implemented");
		
		
	}

	@Override
	public void checkbalance() {
		System.out.println("checkbalance implemented");
		
		
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		
	}

}
