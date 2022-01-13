package prob5;

public class Account {
	
	private String accountNo;
	private int balance;

	public Account(String string) {
		accountNo = string;
	}
	
	public int save(int money) {
		balance += money;
		return balance;
	}
	
	public int deposit(int money) {
		balance -= money;
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
