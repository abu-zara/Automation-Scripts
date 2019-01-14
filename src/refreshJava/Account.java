package refreshJava;

public class Account {

	private String Number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNumber;
	
	public void depositAmount(double depositAmount) {
		System.out.println("A deposit of " + depositAmount + " made. New balance is " + depositAmount);
		this.balance += depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount <= 0) {
			System.out.println("Only " + this.balance + "Available. withdrawal not proceseed ");
		}else {
			this.balance -= withdrawalAmount;
			System.out.println(withdrawalAmount + " dollar withdrawal was processed ." + " Your Available balance is " + this.balance);
		}
		
		this.balance -= withdrawalAmount;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		this.Number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
