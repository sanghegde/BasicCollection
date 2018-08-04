//HashMap to store all of our class students names and their favorite fruits
package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		map.put("sangeeta", "Apple");
		map.put("deepak", "Mango");
		map.put("chandrakala", "Grapes");
		map.put("jayaprakasha", "Watermelon");
		
		Set<Entry<String,String>> set= map.entrySet();
		
		set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue()));
		
		Set keyset=map.keySet();
		System.out.println("Key set values are: "+keyset);
		
	}

}
