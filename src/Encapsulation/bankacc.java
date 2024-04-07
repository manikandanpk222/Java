package Encapsulation;

public class bankacc {

		private double balance;
		private int accno;
		
		public void setbalance(double balance) {
			this.balance=balance;
		}
		public void setaccno(int accno) {
			this.accno=accno;
		}
		public 	double getbalance() {
			return balance;
		}
		public int getaccno() {
			return accno;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        bankacc s=new bankacc();
	        s.setbalance(78.9);
	        s.setaccno(55);
	        
	        System.out.println(s.getbalance());
	        System.out.println(s.getaccno());
		}

	}


