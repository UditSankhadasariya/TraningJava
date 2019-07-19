package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Hello", 10);
		map.put("Hi",20);		
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator itr = entrySet.iterator()
;
		while(itr.hasNext()){
			Map.Entry temp =  (Entry) itr.next();
			System.out.println(temp.getValue());
		}
		
	
	}
}
