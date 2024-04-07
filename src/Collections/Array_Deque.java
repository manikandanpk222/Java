package Collections;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
		// first enter remove first
		//to add an element---offer
		//which element is next to be removed
		
		ArrayDeque<Integer> q=new ArrayDeque();
		q.offer(90);
		q.offer(30);
		q.offer(69);
		q.offer(8);
		q.offer(63);
		q.offerFirst(10);
		q.offerLast(100);
        
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println("-p---------");
		//peek
		q.pollFirst();
		System.out.println(q);
		System.out.println("p-----------");
		q.pollLast();
		System.out.println(q);
		
		System.out.println("+============");
		q.poll();
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		System.out.println(q.contains(67));
		
		System.out.println("------------");
		
		q.clear();
		System.out.println(q);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
	}

}

	
