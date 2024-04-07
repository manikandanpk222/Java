package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queue_list {

	public static void main(String[] args) {
		// first enter remove first
		//to add an element---offer
		//which element is next to be removed
		
		Queue<Integer> q=new LinkedList();
		q.offer(90);
		q.offer(30);
		q.offer(50);
		q.offer(80);
		q.offer(60);
        
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
