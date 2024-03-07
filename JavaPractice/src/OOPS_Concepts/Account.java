package OOPS_Concepts;


public class Account {

	private String Account_Name;
	private int Account_Num;
	private double Balance;
	
	
	public Account(String Name, int Acc_num, double Balance){
		this.Account_Name = Name;
		this.Account_Num = Acc_num;
		this.Balance = Balance;
		
	}
	
	public String getName() {
		return Account_Name;
	}
	
	public void setAccName(String Name) {
		this.Account_Name = Name;
	}
	
	public int Acc_Num() {
		return Account_Num;
	}
	
	public void setAccNum(int Number) {
		this.Account_Num = Number;
	}
	
	public double Acc_Balance() {
		return Balance;
	}
	
	public void setAccBal(double Balance) {
		this.Balance = Balance;
	}
	
	
	
	public void withdraw(double withdraw) {

		System.out.println("Withdrawl Ammount: "+withdraw);
		Balance -= withdraw;
		System.out.println("Remaining Balance is: " +Balance+"\n");
	}
	
	public void Deposit(double Deposit) {
		System.out.println("Amount to be credited: "+Deposit);
		Balance += Deposit;
		System.out.println("New Balance: " +Balance+"\n");
	}

	public String AccInfo() {
		return "Hi "+Account_Name+" "+Account_Num+"\n\nYour Account Balance is: "+Balance;
	}
}
















