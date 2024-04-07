package Operators;

public class Ternaryoper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=-46,y=89;
        int z=(x>y)?x:y;
        System.out.println(z);
        int s=(x<y)?x:y;
        System.out.println(s);
        String result = (x > 0) ? "Positive" : (x < 0) ? "Negative" : "Zero";
        System.out.println("The number is " + result);
	}

}
