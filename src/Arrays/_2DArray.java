package Arrays;

import java.util.Arrays;

public class _2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = {{23,45,32},{67,12,99}};
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				 System.out.println(a[i] [j]);
			}
		}
		 System.out.println("------------------");
		//for each
		for (int [] r:a) {
			for (int z:r) {
				 System.out.println(z+"");
			}
			 System.out.println();
		}
		 System.out.println("--------bhhh----------");
		 
		 for (int []r:a) {
			 System.out.println(Arrays.toString(r));
			 
			 Arrays.stream(a).forEach((i)->{
				 Arrays.stream(i).forEach((j)->System.out.println(j+""));
				  System.out.println();
			 });
		 }

	}

}
