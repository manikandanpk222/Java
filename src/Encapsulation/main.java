package Encapsulation;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount(1000);
		double initialbalance=account.getbalance();
		
		System.out.println("Initial balance:"+initialbalance);
		
		account.deposit(300);
		account.withdraw(200);
		double finalbalance=account.getbalance();
		
		System.out.println("Final balance:"+finalbalance);

	}

}
