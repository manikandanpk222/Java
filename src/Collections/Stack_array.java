package Collections;

import java.util.Stack;

public class Stack_array {

	public static void main(String[] args) {
		// 0,1,2
		//list ---arrarList,stack---last removed
		//add,remove,addall,get,set,contains
		
		Stack<String>obj=new Stack();
		obj.add("harshada");
		obj.add("mani");
		obj.add("shalu");
		obj.add("msan");
		obj.add("rom");
		obj.add("preethi");
		
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);

		//which element next removed
		System.out.println(obj);
		System.out.println(obj.peek());
		obj.pop();
		System.out.println(obj);
		
		System.out.println(obj);
		

	}

}


