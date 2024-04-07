package String;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        // Create a StringBuilder object
		        StringBuilder builder = new StringBuilder();

		        // Append strings to the StringBuilder
		        builder.append("Hello, ");
		        builder.append("World!");
		        builder.insert(10,"World!");

		        // Convert StringBuilder to String
		        String result = builder.toString();

		        // Print the result
		        System.out.println(result);
		    }
		
}
