package collection;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(10,3);
		
		System.out.println(list.capacity());
		System.out.println(list.size());
	
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		list.add("asdasdasd");
		
		
		System.out.println(list.capacity());
		System.out.println(list.size());
		
	}
}
