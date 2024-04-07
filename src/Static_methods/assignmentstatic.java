package Static_methods;

public class assignmentstatic {

	public static void main(String[] args) {
		        
		        int[] originalArray = {1, 2, 3, 4, 5};
		        
		   
		        int[] modifiedArray = modifyArray(originalArray);
		        
		    
		        for (int num : modifiedArray) {
		            System.out.print(num + " ");
		        }
		    }
		    
		  
		    public static int[] modifyArray(int[] array) {
		    
		        for (int i = 0; i < array.length; i++) {
		            array[i]--;
		        }
		        return array;
		    


	}

}
