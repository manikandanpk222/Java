package Serialize;


	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	public class SerializationClass implements Serializable{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Students s1 = new Students();
			s1.name ="Jhon";
			s1.city = "London";
			
			
			String filePath="G:\\Serialization\\tempfile.txt";
			try
			{
				FileOutputStream myFile = new FileOutputStream(filePath);			
				ObjectOutputStream obj = new ObjectOutputStream(myFile);
				
				obj.writeObject(s1);
				System.out.println("Done");
				obj.close();
				myFile.close();
				
			}catch(Exception e)
			{
				System.out.println(e.toString());
			}
				
			
			
		} //main method

	

}
