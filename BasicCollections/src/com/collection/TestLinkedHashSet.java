//add add names to the linkedhashedset 
package com.collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
		
		linkedhashset.add("Sangeeta");
		linkedhashset.add("Deepak");
		linkedhashset.add("Chandrakala");
		linkedhashset.add("Jayaprakasha");
		linkedhashset.add("Krishnamurthy");
		//printing the names
		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}

}
