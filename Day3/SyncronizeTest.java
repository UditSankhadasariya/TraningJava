package Day3;

public class SyncronizeTest extends Thread {
	Account acc;
	int amount;
	
	
	
	public SyncronizeTest(Account acc, int amount) {
		super();
		this.acc = acc;
		this.amount=amount;
		new Thread(this).start();
	}
	public void run() {
		synchronized(acc) {
			acc.withdraw(amount);
			
		}
		
	}



	public static void main(String[] args) {
		Account account = new Account(1000);
		new SyncronizeTest(account, 100);
		new SyncronizeTest(account, 500);
		
	}
	
	
}
