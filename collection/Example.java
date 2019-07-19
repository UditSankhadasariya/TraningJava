package collection;

import java.util.ArrayList;

public class Example {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("hi");
	list.add(23.2);
	list.add("sd");
	
	
	for(Object temp : list) {
		System.out.println(temp);
	}
	
}
}
