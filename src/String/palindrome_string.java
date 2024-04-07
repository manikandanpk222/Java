package String;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String str = "robot";
		        
		        boolean isPalindrome = isPalindrome(str);
		        
		        if (isPalindrome) {
		            System.out.println(str + " is a palindrome.");
		        } else {
		            System.out.println(str + " is not a palindrome.");
		        }
		    }
		    
		    public static boolean isPalindrome(String str) {
		        int length = str.length();
		        
		        for (int i = 0; i < length / 2; i++) {
		           
		            if (str.charAt(i) != str.charAt(length - i - 1)) {
		                return false; 
		            }
		        }
		        
		        return true; 
		    }
		
}
