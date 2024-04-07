package Threads;


	class myTest1 extends Thread{
		
		public void run() {
			
			for(int i=0;i<=10; i++)
			{
				System.out.println("hello world " + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println(Thread.currentThread().getName());
			}
		}
	}


	public class ThreadMethodsClass {

		public static void main(String[] args) throws InterruptedException {
			myTest1 m1 = new myTest1();
			myTest1 m2 = new myTest1();
			myTest1 m3 = new myTest1();
			
			m1.setName("A");
			m2.setName("B");
			m3.setName("C");
			
			m1.setPriority(0);
			m2.setPriority(5);
			m3.setPriority(10);
			
			System.out.println(m1.isAlive());
			m1.start();
			System.out.println(m1.isAlive());
			m2.suspend();
			
			Thread.sleep(10000);
			m2.start();
			m3.stop();
			m3.start();

		}

	}


