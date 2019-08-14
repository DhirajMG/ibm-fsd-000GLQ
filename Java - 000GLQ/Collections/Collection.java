package comm.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collection {
	Scanner sc = new Scanner(System.in);

	private String arrayOfStrings[];
	private Set<String> set = new HashSet<String>();

	public Collection() {
		System.out.println("Enter number of elements in array");
		arrayOfStrings = new String[sc.nextInt()];

		for (int i = 0; i < arrayOfStrings.length; i++) {
			System.out.println("Name:");
			arrayOfStrings[i] = sc.next();
		}

		for (String s : arrayOfStrings) {
			if (!set.add(s.toLowerCase())) {
				System.out.println("Duplicate element found cannot be entered");
			}
		}
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}