package Threads;


	public class ThreadSleepClass {

		public static void main(String[] args) throws InterruptedException {
			int num=5;
			
			for(int i=0; i<5; i++)
			{
				System.out.println("Value of i is " + i);
				Thread.sleep(5000);
			}
		}

	}

