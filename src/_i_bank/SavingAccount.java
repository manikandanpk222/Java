package _i_bank;

public class SavingAccount implements BankAccount{
	private double balance;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited="+balance);
	}
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("withdrawn="+balance);
		}else {
			System.out.println("insufficient fund");
		}
	}
	public double getBalance() {
		return balance;
	}


}
