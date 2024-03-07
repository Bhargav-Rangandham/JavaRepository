package OOPS_Concepts;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	

	public void addAccounts(Account account) {
		accounts.add(account);
	}
	
	public void removeAccounts(Account account) {
		accounts.remove(account);
	}
	
	public void depositMoney(Account Account, double amount) {
		accounts.Deposit(amount);
	}
	public void addBalance(Bank Balance) {
		accounts.
	}
	
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
}
