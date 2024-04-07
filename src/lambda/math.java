package lambda;

public class math {
	interface MathOperation {
	    int operate(int a, int b);
	}

public class try1 {

public static void main(String[] args) {
	// TODO Auto-generated method stu
	// Functional interface with a single method
    // Lambda expression for addition
	        MathOperation addition = (a, b) -> a + b;//parameterized
	        System.out.println("Addition: " + addition.operate(5, 3));
        // Lambda expression for subtraction
	        
	      MathOperation subtraction = (a, b) -> a - b;
	     System.out.println("Subtraction: " + subtraction.operate(5, 3));

	       // Lambda expression for multiplication
	      MathOperation multiplication = (a, b) -> a * b;
	        System.out.println("Multiplication: " + multiplication.operate(5, 3));

	       
	    }



}

}
