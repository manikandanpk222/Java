package File_handling;

	import java.io.File;
	import java.io.IOException;

	public class createafile {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			File obj=new File("G:\\FileHandle\\file1.txt");
			try {
				if(obj.createNewFile()) {
					System.out.println("file has been created");
					
				}
				else {
					System.out.println("file already exists");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
