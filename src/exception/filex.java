package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class filex {
	

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		FileInputStream f=null;
		
		try {
			f= new FileInputStream("C:\\Users\\Admin-pc\\Pictures\\Screenshots");
		}
		catch(SecurityException e) {
			System.out.println("security exception present");
		}
		catch(FileNotFoundException e) {
			System.out.println("file not present");
		}
		catch(Exception e) {
			System.out.println("security exception");
		}
		finally {
			try {
			f.close();
		}
			catch(Exception e) {
				System.out.println("Sucess");
			}
		}

	}

}
