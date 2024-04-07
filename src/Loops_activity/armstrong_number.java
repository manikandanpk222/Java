package Loops_activity;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int store,sum=0;
		int num=153;
		int originalnum=num;
		while(num>0) {
			store=num%10;
			num=num/10;
			sum=sum+store*store*store;
		}
		if(sum==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
	

}
