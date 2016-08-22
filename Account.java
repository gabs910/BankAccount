package ssa;

public class Account {
	private int accountId;
	String description;
	double balance;

	String print() {
		return description + '\n' + "ID: " + getAccountId() + " " + "Balance: " + balance;
	}

	double deposit(double amount) {
		balance += amount;
		System.out.println("You deposited:" + amount);
		return balance;
	}

	double withdrawal(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds!");
		} else {
			balance -= amount;
			System.out.println("You withdrew: " + amount);
		}
		return balance;
	}

	double getBalance() {
		return balance;
	}

	double toSavTransfer(Account other, double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds to make requested transer.");
		} else {
			other.deposit(amount);
			System.out.println("You transferred: " + amount + " to your savings account");
			balance -= amount;

		}
		return balance;

	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}
