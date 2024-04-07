package String_Pack;

public class String_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stuname="Manikandan";
		String rollno="55";
		String stuclass="red";
		
		String str="""
				Hello Everyone my name is %s.
				my rollno is %s
				and i belong to class %s.
				
				""";
		
		String dataformat =String.format(str,stuname,rollno,stuclass);
		
		System.out.println(dataformat);

	}

}
