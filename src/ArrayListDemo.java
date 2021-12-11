import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList<>();
		al.add(12);
		al.add("Welcome");
		al.add(5.2);
		al.add(true);
		al.add('A');
		System.out.println(al); // [12, Welcome, 5.2, true, A]

		System.out.println(al.size()); // 5

		al.remove(1);
		al.remove(5.2);

		System.out.println("After removing : " + al); // [12, true, A]

		al.add(1, "C#");
		al.add(5.55);

		System.out.println(al); // [12, C#, true, A, 5.55]

		System.out.println(al.get(1)); // C#

		al.set(1, "Python");
		System.out.println(al); // [12, Python, true, A, 5.55]

		// Reading ArrayList
		System.out.println("***** Read all elements from Array List using class loop *****");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("***** Read all elements from Array List using For..each loop *****");
		for (Object value : al) {
			System.out.println(value);
		}

		System.out.println("***** Read all elements from Array List using Iterator *****");
		Iterator itr = al.iterator();// getting the Iterator
		while (itr.hasNext())// check if iterator has the elements
		{
			System.out.println(itr.next());// printing the element and move to next
		}

	}
}
