package refreshJava;

public class Car {
	
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;

	
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("daf") || validModel.equals("camry")) {
			this.model = model;
		}else {
			this.model = "unknown";
		}
		
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	

	

}
