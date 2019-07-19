package Day3;

public class Account {
	
	private int balance;
	
	public Account(int bal) {
		this.balance = bal;
	}
	public void withdraw(int amt) {
		if(amt<balance) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.balance = balance-amt;
			System.out.println("Withdrawn"+ balance);
			
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
}
