package Conditional_Statement;

public class daysin_month {
	
	    public static void main(String[] args) {
	        String month = "feb"; 
	        
	        String result=switch (month) {
	            case "jan","mar","may","july","august","oct", "dec"->"31";
	            case "april","jun","sep","nov"->"30";
	            default->"Invalid";
	       
	        };

	 
	        System.out.println("Number : " + result);
	    }
	}



