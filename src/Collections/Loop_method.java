package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loop_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//simple loop++
		for(int i=0;i<obj.size();i++) {
			System.out.println("element use simple loop"+""+obj.get(i));
		}
		
		//foreach loop
		
		for(Integer i:obj) {
			System.out.println(i);
		}
		
		//iterator
		
		Iterator<Integer>it=obj.iterator();
		while(it.hasNext()) {
			System.out.println("print iterator"+it.next());
		}

	}

}
