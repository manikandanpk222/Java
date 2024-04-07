package Encapsulation;

public class BankAccount {
	private double balance;
	
	public BankAccount (double initialbalance) {
		this.balance=initialbalance;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit Successful.New balance"+balance);
		}else {
			System.out.println("Invalid Deposit Amount");
		}
	}
		
		public void withdraw(double amount) {
			if(amount>0&&amount<=balance) {
				balance-=amount;
				System.out.println("Withdrawal success .NewBalance:"+balance);
			}
			else {
				System.out.println("Insufficient fund or invalid withdrawal");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
