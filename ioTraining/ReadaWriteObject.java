package ioTraining;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day2.Account;

public class ReadaWriteObject {
	public void static  storeAccount(Account account) {
		ObjectOutputStream oos = new ObjectInputStream(new FileOutputStream(file));
		oos.writeObject(account);
		oos.close();
		Account account = (Account)ois.readObject();
		
		System.out.println("Data written successfully");
		
		
		
	}
	
	public static Account getAccount() {
		return null;
		
	}
	
	public static void main(String[] args) {
		Account account = new Account("Udit",22233);
		try {
			storeAccount(account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
