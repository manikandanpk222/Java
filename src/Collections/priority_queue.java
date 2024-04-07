package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
	
	public static void main(String[] args) {
		// first enter remove first
		//to add an element---offer
		//which element is next to be removed
		
		Queue<Integer> q=new PriorityQueue(Comparator.reverseOrder());
		q.offer(90);
		q.offer(30);
		q.offer(69);
		q.offer(8);
		q.offer(63);
        
		System.out.println(q);
		System.out.println(q.peek());
		
		//peek
		q.poll();
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		System.out.println(q.contains(67));
		
		q.clear();
		System.out.println(q);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
	}

}


