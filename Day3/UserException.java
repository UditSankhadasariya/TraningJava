package Day3;

class Customer{
	private String custName;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
}


public class UserException {
	public static void main(String[] args) {
		Customer cust = new Customer();
		int amount=100;
		performTransaction(cust ,amount);
	}
	
	
	private static void performTransaction(Customer cust,int amt) {
		if(cust.getCustName().length()<3) {
			throw new myException("TOo small");
		}
	}
}
