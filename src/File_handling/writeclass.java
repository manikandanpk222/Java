package File_handling;

	import java.io.FileWriter;
	import java.io.IOException;

	public class writeclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				FileWriter filewrite=new FileWriter("G:\\FileHandle\\file1.txt");
				filewrite.write("java is a programming language");
				filewrite.close();
				System.out.println("done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


