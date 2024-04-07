package polymorphism;

public class finalkey {
		//Class A
		public class A {
			
			void show()
			{
				System.out.println("Am from show method Class A");
			}
		}	
		
		//Class B
		public class B extends A
		{
			void show()
			{
				System.out.println("Am from show method class B");
			}
		}
		
		//Main method
		public static void main(String[] args) {
		
			Finalkey f = new Finalkey();
			A a = f.new A(); // Creating an instance of class A
		    a.show(); // Calling show method of class A

		    B b = f.new B(); // Creating an instance of class B
		    b.show(); // Calling show method of class B
		}

	}




