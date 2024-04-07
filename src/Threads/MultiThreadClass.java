package Threads;


	class printer{
		
	synchronized void print(int doc, String name) 
		{
			for(int i=0;i<=doc; i++)
			{
				System.out.println(name);
			}
			
		}
		
	}


	class employee1 extends Thread
	{
		printer p;
		
		
		employee1(printer p){
			this.p=p;
		}
		public void run() {
			synchronized(p) {
			p.print(10, "test1.pdf");
		}
		}
	}
		class employee2 extends Thread
		{
			printer p;
			
			
			employee2(printer p){
				this.p=p;
			}
		
		public void run() {
			synchronized(p) {
			p.print(10, "test2.pdf");
		}
		}
	}


	class employee3 extends Thread
	{
		printer p;
		
		
		employee3(printer p){
			this.p=p;
		}
		
		public void run() {
			synchronized(p) {
			p.print(10, "test3.pdf");
		}
		}
	}



	public class MultiThreadClass {

		public static void main(String[] args) {
			System.out.println("Main method - start");
			
			printer p =new printer();
			employee1 emp1 = new employee1(p);
			emp1.start();
			
			employee2 emp2 = new employee2(p);
			emp2.start();
			
			employee3 emp3 = new employee3(p);
			emp3.start();
			
			
			System.out.println("Main method - end");

		}

	}

