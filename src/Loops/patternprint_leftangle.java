package Loops;

public class patternprint_leftangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		        int a = 5; 

		        for (int i = 1; i <= 5; ++i) {
		         
		            for (int j = 1; j <= 10 - i; ++j) {
		                System.out.print("  ");
		            }
		       
		            for (int k = 1; k <= i; ++k) {
		                System.out.print("* ");
		            }
		          
		            System.out.println();
		        }
		    }
	

	}


