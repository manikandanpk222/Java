package Loops_activity;

public class fibonacciseries {

		    public static void main(String[] args) {
		        int n = 20; 
		        int firstTerm = 0;
		        int secondTerm = 1;
		        
		        System.out.println("Fibonacci series up to " + n + " terms:");
		        
		        for (int i = 1; i <= n; ++i) {
		            System.out.print(firstTerm + " ");
		            
		            
		            int nextTerm = firstTerm + secondTerm;
		            firstTerm = secondTerm;
		            secondTerm = nextTerm;
		        }
		    
	}

}
