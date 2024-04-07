package File_handling;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class readone {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			File obj=new File("G:\\FileHandle\\file1.txt");
			try {
				Scanner sc=new Scanner(obj);
				while(sc.hasNextLine()) {
					String data=sc.nextLine();
					System.out.println(data);
					System.out.println(obj.length());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

