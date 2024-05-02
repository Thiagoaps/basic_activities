package entites;

public class Account {	

	private int accountNumber;
	private String holderName;
	private double balance;
	
	public Account(String holderName, int accountNumber) {
		this.holderName = holderName;
		this.accountNumber = accountNumber;
	}

	public Account(String holderName, int accountNumber, double initialDeposit) {
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}
	
	public String getName() {
		return holderName;
	}
	public void setName(String name) {
		this.holderName = name;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	public Double getBalance() {
		return balance;
	}

	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount +5;
	}

	@Override
	public String toString() {
		return  "Account "
				+ accountNumber
				+ ", Holder: "
				+ holderName
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
