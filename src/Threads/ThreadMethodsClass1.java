package Threads;


	class waiting extends Thread
	{
		public void print() throws InterruptedException
		{
			synchronized (this)
			{
				System.out.println("running");
				wait();
				System.out.println("resumed");
			}
		}
	}

	class mytopic extends Thread{
		
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
			
			synchronized(this) {
				System.out.println("waiting for return");
				notify();
			}
			
		}
	}


	public class ThreadMethodsClass1 {

		public static void main(String[] args) throws InterruptedException {
			mytopic d1 = new mytopic();
			mytopic d2 = new mytopic();
			mytopic d3 = new mytopic();
			
			waiting w = new waiting();
			d1.start();
			w.print();
			
			
			
		/*	m1.setName("A");
			m2.setName("B");
			m3.setName("C");
			
			System.out.println("before" + m1.isAlive());
			
			System.out.println("after" +m1.isAlive());
			
			m1.setPriority(0); //minimum
			
			m2.setPriority(5); // medium
			
			m3.setPriority(10); // maximum
			
			m2.start();
			m3.start();
			m3.stop();
			m2.suspend();
			Thread.sleep(10000);
			//m2.resume();*/
			
			
			
		}

	}


