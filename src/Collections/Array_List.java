package Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// list array list
		//add,remove,addall,get,set,contains
		
		List<Integer>obj=new ArrayList();
		obj.add(54);
		obj.add(89);
		obj.add(56);
		obj.add(34);
		obj.add(21);
		obj.add(90);
		
		System.out.println(obj);
		obj.add(2,97);
		System.out.println(obj);

		//addall
		ArrayList<Integer>obj1=new ArrayList();
		obj1.add(876);
		obj1.add(7865);
		obj1.add(3245);
		obj.addAll(obj1);
		System.out.println(obj);
		
		obj.remove(5);
		System.out.println(obj);
		
		//removeAll
		
		obj.removeAll(obj1);
		System.out.println(obj);
		
		//get
		System.out.println(obj.get(5));
		
		//contains
		System.out.println(obj.contains(45));
		
		

	}

}
