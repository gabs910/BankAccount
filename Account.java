package ssa;

public class Account {
	private int accountId;
	String description;
	double balance;
	private static int idCounter = 1000; 

	String print() {
		System.out.println( "Account: " + getAccountId() + " " + "balance is $" + balance + '\n');
		return  description + "Account: " + getAccountId() + " " + "balance is $" + balance + '\n';

	}
	private void setAccountId(){
		this.setAccountId(idCounter);
		idCounter++;
	}
	// deposit method adds to balance when called
	double deposit(double amount) {
		balance += amount;
		return balance;
	}

	// withdrawal method subtracts from balance when call unless condition is
	// not met
	double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds!" + '\n');
		} else {
			balance -= amount;
		}
		return balance;
	}

	double transferFrom(Account other, double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds to make requested transer.");
		} else {
			other.deposit(amount);
			balance -= amount;

		}
		return balance;

	}
// getter for accountId
	public int getAccountId() {
		return accountId;
	}
// setter for accountId
	private void setAccountId(int accountId) {
		this.accountId = accountId;
	}
//getter for balance
	public double getBalance() {
		return balance;
	}
//setter for balance can only be used within class
	public void setBalance(int balance) {
		this.balance = balance;
	}
//getter method getDescription
	public String getDescription() {
		return description;
	}
//setter method description
	public void setDescription(String aDescription) {
		description = aDescription;
	}

	public Account() {
		this.setAccountId();
		this.balance = 0;

	}

	public Account(String aDescription) {
		this.setAccountId();
		description = aDescription;
		this.balance = 0;
		System.out.println();
	}
	public Account(int id, String aDescription) {
		aDescription = description;
		accountId = id;
		this.balance = 0;
	}  
}
