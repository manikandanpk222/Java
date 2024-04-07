package Threads;

	
	class myclass1 extends Thread{
		
		public void run()
		{
			for (int i=0;i<10; i++)
			{
				System.out.println("myClass1 run - For loop");
			}
		}
		
	}


	class myclass2 implements Runnable  {
		
		public void run()
		{
			for (int i=0;i<10; i++)
			{
				System.out.println("myClass2 run - For loop");
			}
		}
		
	}



	public class Threads1 {
		
		public static void main(String[] args) {
			
			System.out.println("main start");
			myclass1 mc1=new myclass1();
			//mc.print();
			mc1.start();
			
			Runnable rb = new myclass2();
			Thread task= new Thread(rb);
			task.start();
			
			for(int i=0;i<=10; i++)
			{
				System.out.println("main - For loop");
			}
			
			System.out.println("main end");

		}

	}


