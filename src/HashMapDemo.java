import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer , String> h = new HashMap<>();
		h.put(101 , "David");
		h.put(102 , "Tye");
		h.put(103 , "John");
		h.put(104 , "Trent");
		h.put(105 , "Andrew");
		System.out.println(h); //{101=David, 102=Tye, 103=John, 104=Trent, 105=Andrew}
		System.out.println(h.get(104)); // Trent
		h.remove(104);
		System.out.println(h); // {101=David, 102=Tye, 103=John, 105=Andrew}
		System.out.println(h.containsKey(103)); //true
		System.out.println(h.containsValue("Andrew")); //true
		System.out.println(h.keySet()); // [101, 102, 103, 105]
		System.out.println(h.values()); // [David, Tye, John, Andrew]
		System.out.println(h.entrySet()); // [101=David, 102=Tye, 103=John, 105=Andrew]
		
		for(Object i:h.keySet())
		{
			System.out.println(i);
		}
		
		for(Object i:h.values())
		{
			System.out.println(i);
		}
		
		//Entry methods
		
		Set m = h.entrySet();
		Iterator itr = m.iterator();
		
		while(itr.hasNext()) 
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
