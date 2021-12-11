import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); // default capacity 16 Load Factor: 0.75

		// Add elements into linked list
		hs.add(100);
		hs.add("welcome");
		hs.add(15.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);

		System.out.println(hs); // insertion order NOT Preserved

		System.out.println(hs.size()); // 6

		// remove
		hs.remove(15.5); // value
		System.out.println("After removing , new set:" + hs);

		// contains() - searching
		System.out.println(hs.contains("welcome")); // true
		System.out.println(hs.contains("Python")); // false

		// isEmpty()
		System.out.println(hs.isEmpty()); // false

		// Reading elements from LL using for..each loop
		for (Object e : hs) {
			System.out.println(e);
		}

		// iterator() method
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
