package Arrays;

import java.util.Arrays;

public class DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]=new int[5];
		 a[0]=1;
		 a[1]=34;
		 a[2]=24;
		 a[3]=12;
		 a[4]=78;
		 
		 for (int i=0;i<=a.length-1;i++) {
			 System.out.println(a[i]);
		 }
		 for (int b:a) {
			 System.out.println(b);
		 }
		  
		 System.out.println(Arrays.toString(a));
		 
		 Arrays.stream(a).forEach(a1-> System.out.println(a1+""));
		 
		 //advance loop
		 int sum =0;
		 for (int b:a) {
			 sum+=b;
		 }
		 System.out.println(sum);

	}
}
