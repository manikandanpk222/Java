package Arrays;

public class shallowcopy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] originalArray= {1,2,3,4};
		int [] shallowCopyArray=originalArray;
		shallowCopyArray[0]=10;
		
		System.out.println("Original Array:");
        for (int num:originalArray) {
        	System.out.println(num);
        	
        }
        System.out.println("Shallow Array Copy:");
        for (int num:shallowCopyArray) {
        	System.out.println(num);
        }
	}

}
