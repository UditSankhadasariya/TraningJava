package day2;

public class AccImpl {
	public static void main(String[] args) {
		Account acc1 = new Account("ass",1000);
		Account acc2 = new Account("aasgss",3000);
		Account acc3 = new Account("aasfdasdfss",4000);
		
		
		System.out.println(acc3.getInitialBalance());
		System.out.println(acc2.getInitialBalance());
		System.out.println(acc1.getInitialBalance());
	}
}
