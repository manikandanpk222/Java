package _i_bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savingAccount=new SavingAccount();
		BankAccount checkinAccount=new CheckingAccount();
		System.out.println("savings account");
		savingAccount.deposit(1000);
		savingAccount.withdraw(500);
		System.out.println("balance:"+savingAccount.getBalance());
		System.out.println();
		System.out.println("checking account");
		checkinAccount.deposit(1500);
		checkinAccount.withdraw(2000);
		System.out.println("balance:"+checkinAccount.getBalance());

	}
}