package File_handling;

	import java.io.File;

	public class getinfo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			File obj=new File("G:\\FileHandle\\file1.txt");
			System.out.println(obj.exists());
			if(obj.exists()) {
				System.out.println(obj.getName());
				System.out.println(obj.getAbsolutePath());
				System.out.println(obj.canWrite());
				System.out.println(obj.canRead());
				System.out.println(obj.length());
				System.out.println(obj.canExecute());
			}
			else {
				System.out.println("file doesnt exist");
			}

		}

	}



