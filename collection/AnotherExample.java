package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AnotherExample {
	public static void main(String args[]) {
		List<String> goodmorning = Arrays.asList("Good Morning","Namaskar","Bon JOur");
		
		
		Map<String, List<String>> map = new HashMap<>();
		map.put("Good Morning",goodmorning);
		
		Iterator<Entry<String,List<String>>> iterator = map.entrySet().iterator();
		
		
		while(iterator.hasNext()) {
			Entry<String , List<String>> next = iterator.next();
			for(String temp : next.getValue()) {
				System.out.println(temp);
			}
		}
		
		
	}
}
