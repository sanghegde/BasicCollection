// Add all the names of our class students randomly to a TreeSet, iterate through them and print.
ackage com.collection;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<>();
		
		treeset.add("Sangeeta");
		treeset.add("Deepak");
		treeset.add("Chandrakala");
		treeset.add("Jayaprakasha");
		treeset.add("Krishna");
		
		treeset.stream().forEach((name) -> System.out.println(name));

	}

}
