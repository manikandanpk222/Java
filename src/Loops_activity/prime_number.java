package Loops_activity;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7,temp=0;
		for(int i=2;i<=num-1;i++) {
		if(num %i==0) {
		temp+=1;
		}}
	
	if(temp>0) {
		System.out.println("not prime number");
	}

	else {
		System.out.println("prime number");
	}
}
}

