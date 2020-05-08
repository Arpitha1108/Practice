package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> h = new  HashSet<>();//will not return in an order
		LinkedHashSet<Integer> l = new LinkedHashSet<>();//will return in the same order
		Set<Integer> s = new TreeSet<>();//will return in ascending order
		for(int i=1;i<=10;i++) {
			int number = r.nextInt(100);
			h.add(number);
			l.add(number);
			s.add(number);
			System.out.println(number);
		}
		System.out.println("elements of hashset:"+h);
		System.out.println("elements of linked hashset:"+l);
		System.out.println("elements of tree set :"+s);
	}

}
