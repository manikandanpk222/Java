package Arrays;

import java.util.Arrays;

public class jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr [] []=new int [3] [];
        arr[0] =new int [] {3,6,7};
        arr[1] =new int [] {3,6,7,2,9};
        for (int []a:arr) {
        	System.out.println(Arrays.toString(a));
        }
        
	}

}
