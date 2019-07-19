package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		ArrayList<String> ar1= new ArrayList<String>();
		
		ar.add("Hello");
		ar.add("23");
		ar1.add(ar.get(0));
		ar1.add(ar.get(1));
		System.out.println(ar1);
		
		for(String temp : ar) {
			System.out.println(temp);
		}
		
		
		
		
		
		
	}
}
