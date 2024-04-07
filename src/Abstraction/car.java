package Abstraction;

public class car extends vehicle{


	@Override
	void Start() {
		// TODO Auto-generated method stub
			System.out.println("With a key");
	}
			
			public static void main(String [] args) {
				car c=new car();
				c.Start();
				bike b= new bike();
				b.Start();
			
		
	}

}
