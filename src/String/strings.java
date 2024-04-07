package String;

public class strings {

	public static void main(String[] args) {
		// string literals 
		String a1="Hello";
		System.out.println(a1);
	
	    String a="Hello";
	    String b="World";
	    String c="World";
	    String result=a.concat(c);
	    System.out.println(a.concat(b));
	    
	    System.out.println(a.length());
	    //charAt
	    System.out.println(a.charAt(3));
	    //equals
	    System.out.println(a.equals(c));
	    
	    System.out.println(a.toUpperCase());
	    
	    System.out.println(a.toLowerCase());
//	    System.out.println(a.charAt(-1));
	    System.out.println(result.substring(2,6));
	    //equalsIgnoreif
	    System.out.println(c.equalsIgnoreCase(b));
//	    replace
	    System.out.println(result.replace("Hello","hi"));
	    
	    System.out.println(a.indexOf('l'));

//	    compare
	    
	    int com =a.compareTo(b);
	    System.out.println(com);
	    
//	    trim
	    String a2="Mani Kandan";
	    System.out.println(a.charAt(1));
	    String a3=a2.trim();
	    System.out.println(a3.charAt(1));
	    
//	    string or not
	    System.out.println(result.contains(a));
	    
	    System.out.println(a2.startsWith("M"));
	    
	    String [] fru2= {"apple","banana","orange"};
	    String simple= String.join(",", fru2);
	    System.out.println(simple);
	}

}
