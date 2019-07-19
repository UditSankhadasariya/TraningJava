package day2;

public class Account {
	private int accId;
	private String customerName;
	private double initialBalance;
	private static int count = 100;
	
	
	
	public Account(String customerName, double initialBalance) {
		this.customerName = customerName;
		this.initialBalance = initialBalance;
		this.accId=count++;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getAccId() {
		return accId;
	}



	public double getInitialBalance() {
		return initialBalance;
	}



	public int getCount() {
		return count;
	}
	
	
}
