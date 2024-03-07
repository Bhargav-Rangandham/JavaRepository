package OOPS_Concepts;

import java.util.ArrayList;

public class Bank3 {
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		
		Account accounts = new Account("Bhargav", 238, 6000);
		Account accounts1 = new Account("Sruthi", 205, 7000);
		b1.addAccounts(accounts);
		b1.addAccounts(accounts1);
		
		ArrayList<Account> list = b1.getAccounts();
		
		for(Account List: list ) {
			System.out.println(List);
		}
		
	}
	
}
