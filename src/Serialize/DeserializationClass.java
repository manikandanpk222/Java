package Serialize;

	import java.io.FileInputStream;
	import java.io.ObjectInputStream;

	public class DeserializationClass {

		public static void main(String[] args) {
			
			String nameFile = "G:\\Serialization\\tempfile.txt";
			try
			{
				FileInputStream file = new FileInputStream(nameFile);
				ObjectInputStream obj = new ObjectInputStream(file);
				
				Students stu=(Students)obj.readObject();
				
				System.out.println(stu.name);
				System.out.println(stu.city);
				
				obj.close();
				file.close();
				
			} catch( Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

